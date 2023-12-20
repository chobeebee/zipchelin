package com.zipchelin.model.service;

import com.zipchelin.domain.Member;
import com.zipchelin.model.EmailApplicationEvent;
import com.zipchelin.model.dto.member.EmailDto;
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
import java.util.HashMap;
import java.util.Optional;
import java.util.Random;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberService {

    public static HashMap<String, String> codeStore = new HashMap<>();

    private final JavaMailSender mailSender;
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;
    private final ApplicationEventPublisher publisher;

    @Transactional
    public String saveMember(MemberSaveDto params) {

        Optional<Member> findById = memberRepository.findById(params.getMemberId());
        if (findById.isPresent()) {
            throw new DuplicateException("이미 존재하는 아이디입니다.");
        }

        params.encodingPassword(passwordEncoder);
        return memberRepository.save(params.toEntity());
    }

    public boolean confirmEmail(EmailDto params) {

        String email = params.getEmail();
        String code = params.getCode();
        String findCode = codeStore.get(email);

        log.info("받은 코드 = {}, 서버의 코드 = {}", code, findCode);

        if (code.equals(findCode)) {
            log.info("일치!");
            codeStore.remove(email);
            return true;
        }
        return false;
    }

    public void mailForm(String email) {

        String authCode = createCode();
        if (codeStore.containsKey(email)) {
            throw new BusinessLogicException("이미 인증번호가 발송되었습니다. 3분 이내에 재전송이 불가합니다.");
        }

        codeStore.put(email, authCode);
        log.info("서버에 저장 // 이메일 = {}, 코드 = {}", email, authCode);

        String toMail = email;
        String title = "회원 가입 인증 이메일 입니다.";
        String content = "<h3>인증 번호는 </h3>" +
                "<h1>" + authCode + "</h1><h3> 입니다.</h3>" +
                "<br><p>인증번호를 입력해주세요.</p>";

        mailSend(toMail, title, content);
        ;
        publisher.publishEvent(new EmailApplicationEvent(this, email, authCode));
    }

    public String createCode() {
        Random r = new Random();
        StringBuilder randomNumber = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            randomNumber.append(Integer.toString(r.nextInt(10)));
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
            throw new BusinessLogicException(e);
        }
    }
}
