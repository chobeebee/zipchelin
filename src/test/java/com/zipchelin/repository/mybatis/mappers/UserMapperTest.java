package com.zipchelin.repository.mybatis.mappers;

import com.zipchelin.domain.User;
import com.zipchelin.model.dto.user.UserRequestDto;
import com.zipchelin.model.service.UserService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@SpringBootTest
class UserMapperTest {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserService userService;

    @Test
    void encodingSave() {
        UserRequestDto userSave = UserRequestDto.builder()
                .userId("test123")
                .userPwd("test")
                .userEmail("test@test.com")
                .userName("테스트")
                .userPhone("01012345678")
                .build();

        userService.saveUser(userSave);
        User findUser = userMapper.findById("test123").orElseThrow(() -> new NullPointerException("찾는 유저가 없습니다."));

        Assertions.assertThat(findUser.getUserName()).isEqualTo("테스트");
    }

    @Test
    void update() {
        UserRequestDto userModify = UserRequestDto.builder()
                .userId("test123")
                .userPwd("test")
                .userEmail("modify@modify.com")
                .userPhone("01012345678")
                .userImg("")
                .build();
        User user = userModify.toEntity();

        userMapper.update(user);
        User findUser = userMapper.findById("test123").orElseThrow(() -> new NullPointerException("찾는 유저가 없습니다."));

        assertThat(findUser.getUserEmail()).isEqualTo("modify@modify.com");
    }

    @Test
    void deleteById() {
        userMapper.deleteById("test123");
        assertThatThrownBy(() -> userMapper.findById("test123").orElseThrow(() -> new NullPointerException("찾는 유저가 없습니다."))).isInstanceOf(NullPointerException.class);
    }

    @Test
    void countById() {
    }
}