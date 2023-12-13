package com.zipchelin.model.service;

import com.zipchelin.model.dto.UserRequestDto;
import com.zipchelin.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Transactional
    public String saveUser(UserRequestDto params) {
        params.encodingPassword(passwordEncoder);
        return userRepository.save(params.toEntity());
    }
}
