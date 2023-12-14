package com.zipchelin.repository.mybatis.mappers;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.User;

@Mapper
public class NoticeMapper {
	
    void save(User user);

    void update(User user);

    void deleteById(String userId);

    Optional<User> findById(String userId);

    int countById(String userId);

}
