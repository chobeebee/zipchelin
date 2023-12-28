//package com.zipchelin.repository.mybatis.mappers;
//
//import com.zipchelin.domain.member.Member;
//import com.zipchelin.model.dto.member.MemberRequestDto;
//import com.zipchelin.model.dto.member.MemberSaveDto;
//import com.zipchelin.model.service.MemberService;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.assertj.core.api.Assertions.assertThatThrownBy;
//
//@SpringBootTest
//class MemberMapperTest {
//
//    @Autowired
//    MemberMapper memberMapper;
//    @Autowired
//    MemberService memberService;
//
//    @Test
//    void encodingSave() {
//        MemberSaveDto memberSave = MemberSaveDto.builder()
//                .memberId("test123")
//                .memberPwd("test")
//                .memberEmail("test@test.com")
//                .memberName("테스트")
//                .build();
//
//        memberService.saveMember(memberSave);
//        Member findMember = memberMapper.findById("test123").orElseThrow(() -> new NullPointerException("찾는 유저가 없습니다."));
//
//        Assertions.assertThat(findMember.getMemberName()).isEqualTo("테스트");
//    }
//
//    @Test
//    void update() {
//        MemberRequestDto memberModify = MemberRequestDto.builder()
//                .memberId("test123")
//                .memberPwd("test")
//                .memberEmail("modify@modify.com")
//                .memberImg("")
//                .build();
//        Member member = memberModify.toEntity();
//
//        memberMapper.update(member);
//        Member findMember = memberMapper.findById("test123").orElseThrow(() -> new NullPointerException("찾는 유저가 없습니다."));
//
//        assertThat(findMember.getMemberEmail()).isEqualTo("modify@modify.com");
//    }
//
//    @Test
//    void deleteById() {
//        memberMapper.deleteById("test123");
//        assertThatThrownBy(() -> memberMapper.findById("test123").orElseThrow(() -> new NullPointerException("찾는 유저가 없습니다."))).isInstanceOf(NullPointerException.class);
//    }
//
//    @Test
//    void countById() {
//    }
//}