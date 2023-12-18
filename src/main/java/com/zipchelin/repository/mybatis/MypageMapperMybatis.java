package com.zipchelin.repository.mybatis;

import org.springframework.stereotype.Repository;

import com.zipchelin.repository.MypageRepository;
import com.zipchelin.repository.mybatis.mappers.MypageMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MypageMapperMybatis implements MypageRepository{

	private final MypageMapper mypageMapper;
}
