package com.zipchelin.repository;

import java.util.Optional;

import com.zipchelin.domain.Notice;

public interface NoticeRepository {

    String save(Notice notice);

    void update(Notice notice);

    void deleteById(String adminId);
}
