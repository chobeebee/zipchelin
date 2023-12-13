package com.zipchelin.model.service;

import com.zipchelin.domain.User;
import com.zipchelin.model.dto.user.UserLoginDto;
import com.zipchelin.model.dto.user.UserRequestDto;
import com.zipchelin.model.dto.user.UserResponseDto;
import com.zipchelin.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public String saveUser(UserRequestDto params) {
        params.encodingPassword(passwordEncoder);
        return userRepository.save(params.toEntity());
    }

    public UserResponseDto login(UserLoginDto params) {

        User findById = userRepository.findById(params.getUserId()).orElse(null);
        String encodedPassword = (findById == null) ? "" : findById.getUserPwd();

        if ((findById == null) || !passwordEncoder.matches(params.getUserPwd(), encodedPassword)) {
            return null;
        }

        return findById.toDto();
    }
}
