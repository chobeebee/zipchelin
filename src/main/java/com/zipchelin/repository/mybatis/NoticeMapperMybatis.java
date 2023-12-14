package com.zipchelin.repository.mybatis;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.zipchelin.domain.Notice;
import com.zipchelin.repository.NoticeRepository;
import com.zipchelin.repository.mybatis.mappers.NoticeMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class NoticeMapperMybatis implements NoticeRepository {
	
	private final NoticeMapper noticeMapper;

	@Override
	public String save(Notice notice) {
		noticeMapper.save(notice);
		return null;
	}

	@Override
	public void update(Notice notice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(String noticeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Notice> findById(String noticeId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int countById(String noticeId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
