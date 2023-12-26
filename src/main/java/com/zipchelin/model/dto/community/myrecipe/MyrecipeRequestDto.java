  package com.zipchelin.model.dto.community.myrecipe;

import com.zipchelin.domain.community.Myrecipe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class MyrecipeRequestDto {

	private Long myreNum;
    private String memberId;
    private String myreTitle;
    private String myreContent;

    public Myrecipe toEntity() {
        return Myrecipe.builder()
        		.myreNum(myreNum)
                .memberId(memberId)
                .myreTitle(myreTitle)
                .myreContent(myreContent)
                .build();
    }
}
