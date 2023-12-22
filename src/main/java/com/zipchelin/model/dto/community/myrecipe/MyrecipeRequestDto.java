package com.zipchelin.model.dto.community.myrecipe;

import com.zipchelin.domain.community.Myrecipe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@AllArgsConstructor
public class MyrecipeRequestDto {

    @NotBlank
    private String userId;

    @NotBlank
    private String myreTitle;

    @NotBlank
    private String myreContent;

    public Myrecipe toEntity() {
        return Myrecipe.builder()
                .userId(userId)
                .myreTitle(myreTitle)
                .myreContent(myreContent)
                .build();
    }
}
