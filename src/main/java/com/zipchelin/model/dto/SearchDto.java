package com.zipchelin.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchDto {

    private int page;             // 현재 페이지 번호
    private int displaySize;      // 페이지당 출력할 데이터 개수
    private int pageSize;         // 화면 하단에 출력할 페이징 사이즈
    private String keyword;       // 검색 키워드
    private String searchType;    // 검색 유형
    private PagingDto paging;

    public SearchDto() {
        this.page = 1;
        this.displaySize = 3;
        this.pageSize = 5;
    }
}
