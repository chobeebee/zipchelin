package com.zipchelin.repository;

import com.zipchelin.domain.User;

import java.util.Optional;

public interface UserRepository {

    String save(User user);

    void update(User user);

    void deleteById(String userId);

    Optional<User> findById(String userId);

    int countById(String userId);
}