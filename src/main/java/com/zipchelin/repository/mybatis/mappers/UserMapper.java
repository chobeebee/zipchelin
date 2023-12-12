package com.zipchelin.repository.mybatis.mappers;

import com.zipchelin.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface UserMapper {

    void save(User user);

    void update(User user);

    void deleteById(String userId);

    Optional<User> findById(String userId);

    int countById(String userId);
}
