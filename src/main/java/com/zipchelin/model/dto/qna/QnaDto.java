package com.zipchelin.model.dto.qna;

import com.zipchelin.model.dto.common.PagingDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QnaDto {

    private int page;             // 현재 페이지 번호
    private int displaySize;      // 페이지당 출력할 데이터 개수
    private int pageSize;         // 화면 하단에 출력할 페이징 사이즈
    private PagingDto paging;

    public QnaDto() {
        this.page = 1;
        this.displaySize = 10;
        this.pageSize = 5;
    }
}
