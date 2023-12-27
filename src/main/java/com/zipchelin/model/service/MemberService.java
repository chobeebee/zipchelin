package com.zipchelin.model.service;

import com.zipchelin.domain.member.Member;
import com.zipchelin.model.EmailApplicationEvent;
import com.zipchelin.model.dto.member.EmailDto;
import com.zipchelin.model.dto.member.FindIdDto;
import com.zipchelin.model.dto.member.FindPwdDto;
import com.zipchelin.model.dto.member.MemberSaveDto;
import com.zipchelin.repository.MemberRepository;
import com.zipchelin.web.exception.BusinessLogicException;
import com.zipchelin.web.exception.DuplicateException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberService {

    public static ConcurrentHashMap<String, String> codeStore = new ConcurrentHashMap<>();

    private final JavaMailSender mailSender;
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;
    private final ApplicationEventPublisher publisher;

    @Transactional
    public String saveMember(MemberSaveDto params) {

        if (!codeStore.containsKey(params.getMemberEmail() + "/authed")) {
            log.info("비인가 이메일 가입시도 = {}", params.getMemberEmail());
            throw new BusinessLogicException("인증되지 않았거나, 인증이 만료된 이메일 입니다.");
        }

        Optional<Member> findById = memberRepository.findById(params.getMemberId());
        if (findById.isPresent()) {
            throw new DuplicateException("이미 존재하는 아이디입니다.");
        }

        codeStore.remove(params.getMemberEmail() + "/authed");
        params.encodingPassword(passwordEncoder);
        return memberRepository.save(params.toEntity());
    }

    public boolean confirmEmail(EmailDto params) {

        String email = params.getEmail();
        String code = params.getCode();
        String findCode = codeStore.get(email);

        log.info("받은 코드 = {}, 서버의 코드 = {}", code, findCode);

        if (code.equals(findCode)) {
            codeStore.remove(email);
            codeStore.put(email + "/authed", "authed");
            publisher.publishEvent(new EmailApplicationEvent(this, email + "/authed", "authed"));
            return true;
        }
        return false;
    }

    public void mailForm(String email) {

        String authCode = createCode();
        if (codeStore.containsKey(email)) {
            throw new BusinessLogicException("같은 이메일로는 3분 이내에 재전송이 불가합니다.");
        }

        codeStore.put(email, authCode);
        log.info("서버의 인메모리 저장소 // 이메일 = {}, 코드 = {}", email, authCode);

        String toMail = email;
        String title = "회원 가입 인증 이메일 입니다.";
        String content = "<h3>인증 번호는 </h3>" +
                "<h1>" + authCode + "</h1><h3> 입니다.</h3>" +
                "<br><p>인증번호를 입력해주세요.</p>";

        CompletableFuture.runAsync(() -> mailSend(toMail, title, content));

        publisher.publishEvent(new EmailApplicationEvent(this, email, authCode));
    }

    public String createCode() {
        Random r = new Random();
        StringBuilder randomNumber = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            randomNumber.append(r.nextInt(10));
        }
        return randomNumber.toString();
    }

    public void mailSend(String toMail, String title, String content) {

        MimeMessage message = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "utf-8");
            // true : multipart 형식의 메세지 지원
            helper.setFrom(new InternetAddress("na10111010@gmail.com", "zipchelin"));
            helper.setTo(toMail);
            helper.setSubject(title);
            helper.setText(content, true);
            mailSender.send(message);
        } catch (MessagingException | UnsupportedEncodingException e) {
            log.error("MemberService.mailSend()", e);
        }
    }

    public boolean countId(String memberId) {
        int count = memberRepository.countById(memberId);
        return count == 0;
    }

    public String findId(FindIdDto params) {
        Member findMember = memberRepository.findByEmail(params.getFindIdEmail())
                .orElseThrow(() -> new BusinessLogicException("가입되지 않은 이메일입니다."));

        if (!findMember.getMemberName().equals(params.getFindIdName())) {
            throw new BusinessLogicException("이메일과 이름이 일치하지 않습니다.");
        }

        return findMember.getMemberId();
    }

    public void pwdReset(FindPwdDto params) {
        Member findMember = memberRepository.findById(params.getFindPwdId())
                .orElseThrow(() -> new BusinessLogicException("가입되지 않은 아이디입니다."));

        if (!findMember.getMemberEmail().equals(params.getFindPwdEmail())
        || !findMember.getMemberName().equals(params.getFindPwdName())) {
            throw new BusinessLogicException("입력하신 회원정보와 일치하지 않습니다.");
        }

        String pwdReset = createCode();
        resetPwdForm(findMember.getMemberEmail(), pwdReset);

        String encodedPwd = passwordEncoder.encode(pwdReset);
        Member member = Member.builder()
                .memberId(params.getFindPwdId())
                .memberPwd(encodedPwd)
                .build();
        memberRepository.pwdReset(member);
    }

    public void resetPwdForm(String email, String pwdReset) {

        if (codeStore.containsKey(email)) {
            throw new BusinessLogicException("같은 이메일로는 3분 이내에 재전송이 불가합니다.");
        }
        codeStore.put(email, pwdReset);

        String toMail = email;
        String title = "비밀번호 찾기 회신입니다.";
        String content = "<h3>초기화 된 비밀번호는 </h3>" +
                "<h1>" + pwdReset + "</h1><h3> 입니다.</h3>" +
                "<br><p>회원정보에서 재설정 해주세요.</p>";

        CompletableFuture.runAsync(() -> mailSend(toMail, title, content));
        publisher.publishEvent(new EmailApplicationEvent(this, email, pwdReset));
    }
}
