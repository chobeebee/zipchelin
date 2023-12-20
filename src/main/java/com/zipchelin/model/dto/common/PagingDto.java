package com.zipchelin.model.dto.common;

import com.zipchelin.model.dto.qna.QnaDto;
import lombok.Getter;

@Getter
public class PagingDto {

    private int totalData;       // 전체 데이터 수
    private int totalPage;       // 전체 페이지 수
    private int startPage;      // 첫 페이지 번호
    private int endPage;        // 끝 페이지 번호
    private int startIndex;     // 시작 인덱스
    private int endIndex;       // 끝 인덱스
    private boolean prevPage;    // 이전 페이지 존재 여부
    private boolean nextPage;    // 다음 페이지 존재 여부

    public PagingDto(int totalData, QnaDto params) {
        if (totalData > 0) {
            this.totalData = totalData;
            calculation(params);
        }
    }

    private void calculation(QnaDto params) {

        // 전체 페이지 수 계산
        totalPage = ((totalData - 1) / params.getDisplaySize()) + 1;

        // 현재 페이지 번호가 전체 페이지 수보다 큰 경우, 현재 페이지 번호에 전체 페이지 수 저장
        if (params.getPage() > totalPage) {
            params.setPage(totalPage);
        }

        // 첫 페이지 번호 계산
        startPage = ((params.getPage() - 1) / params.getPageSize()) * params.getPageSize() + 1;

        // 끝 페이지 번호 계산
        endPage = startPage + params.getPageSize() - 1;

        // 끝 페이지가 전체 페이지 수보다 큰 경우, 끝 페이지 전체 페이지 수 저장
        if (endPage > totalPage) {
            endPage = totalPage;
        }

        // index 계산
        endIndex = params.getPage() * params.getDisplaySize();
        startIndex = endIndex - (params.getDisplaySize() - 1);

        // 이전 페이지 존재 여부 확인
        prevPage = startPage != 1;

        // 다음 페이지 존재 여부 확인
        nextPage = (endPage * params.getDisplaySize()) < totalData;
    }
}
