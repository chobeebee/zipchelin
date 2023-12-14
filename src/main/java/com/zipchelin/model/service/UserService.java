package com.zipchelin.model.service;

import com.zipchelin.domain.User;
import com.zipchelin.model.dto.user.UserLoginDto;
import com.zipchelin.model.dto.user.UserRequestDto;
import com.zipchelin.model.dto.user.UserResponseDto;
import com.zipchelin.repository.UserRepository;
import com.zipchelin.web.exception.BadRequestException;
import com.zipchelin.web.exception.DuplicateException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public String saveUser(UserRequestDto params) {

        Optional<User> findById = userRepository.findById(params.getUserId());
        if (findById.isPresent()) {
            throw new DuplicateException("이미 존재하는 아이디입니다.");
        }

        params.encodingPassword(passwordEncoder);
        return userRepository.save(params.toEntity());
    }

    public UserResponseDto login(UserLoginDto params) {

        User findById = userRepository.findById(params.getUserId())
                .orElseThrow(() -> new NullPointerException("아이디 또는 비밀번호 오류입니다."));

        String encodedPassword = (findById == null) ? "" : findById.getUserPwd();

        if ((findById == null) || !passwordEncoder.matches(params.getUserPwd(), encodedPassword)) {
            return null;
        }

        return findById.toDto();
    }
}
