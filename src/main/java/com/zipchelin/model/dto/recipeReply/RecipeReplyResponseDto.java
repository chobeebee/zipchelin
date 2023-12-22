package com.zipchelin.model.dto.recipeReply;

import com.zipchelin.domain.RecipeReply;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@AllArgsConstructor
public class RecipeReplyResponseDto {

    @NotBlank
    private int mReNum;

    @NotBlank
    private int myReNum;

    @NotBlank
    private String userImg;

    @NotBlank
    private String postId;

    @NotBlank
    private String reId;

    @NotBlank
    private String reContent;

    @NotBlank
    private int reUp;

    public RecipeReply toEntity() {
        return RecipeReply.builder()
                .mReNum(mReNum)
                .myReNum(myReNum)
                .userImg(userImg)
                .postId(postId)
                .reId(reId)
                .reContent(reContent)
                .reUp(reUp)
                .build();
    }
}
