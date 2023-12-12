package com.zipchelin.model.service;

import com.zipchelin.model.dto.UserSaveDto;
import com.zipchelin.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public String saveUser(UserSaveDto params) {
        return userRepository.save(params.toEntity());
    }
}
