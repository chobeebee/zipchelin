package com.zipchelin.model.dto.community.myrecipeReply;

import com.zipchelin.domain.community.MyRecipeReply;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@AllArgsConstructor
public class MyRecipeReplyRequestDto {

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

    public MyRecipeReply toEntity() {
        return MyRecipeReply.builder()
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
