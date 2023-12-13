package com.zipchelin.repository.mybatis.mappers;

import com.zipchelin.domain.User;
import com.zipchelin.model.dto.UserModifyDto;
import com.zipchelin.model.dto.UserSaveDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;

@SpringBootTest
class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    void save() {
        UserSaveDto userSave = UserSaveDto.builder()
                .userId("test123")
                .userPwd("test")
                .userEmail("test@test.com")
                .userName("테스트")
                .userPhone("01012345678")
                .build();
        User user = userSave.toEntity();

        userMapper.save(user);
        User findUser = userMapper.findById("test123").orElseThrow(() -> new NullPointerException("찾는 유저가 없습니다."));

        Assertions.assertThat(findUser.getUserName()).isEqualTo("테스트");
    }

    @Test
    void update() {
        UserModifyDto userModify = UserModifyDto.builder()
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