package com.zipchelin.repository.mybatis;

import com.zipchelin.domain.User;
import com.zipchelin.repository.UserRepository;
import com.zipchelin.repository.mybatis.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserMapperMybatis implements UserRepository {

    private final UserMapper userMapper;

    @Override
    public String save(User user) {
        userMapper.save(user);
        return user.getUserName();
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void deleteById(String userId) {

    }

    @Override
    public Optional<User> findById(String userId) {
        return Optional.empty();
    }

    @Override
    public int countById(String userId) {
        return 0;
    }
}
