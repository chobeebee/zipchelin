package com.zipchelin.model.dto.recipe;

import com.zipchelin.domain.Recipe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;


@Getter
@Builder
@AllArgsConstructor
public class RecipeAddRequestDto {

    @NotBlank
    private int recNum;

    @NotBlank
    private int cateNum;

    @NotBlank
    private String recTitle;

    @NotBlank
    private String recSubt;

    @NotBlank
    private String recImg0;

    @NotBlank
    private String recDesc0;

    @NotBlank
    private String recIngreMain;

    @NotBlank
    private String recIngreSub;

    @NotBlank
    private String recTool;
    //만약 첫 요청이라면?(또는 오는 =값이 null이면) 전체보기 보여주게

    @NotBlank
    private String recImg1;

    @NotBlank
    private String recDesc1;

    @NotBlank
    private String recImg2;

    @NotBlank
    private String recDesc2;

    @NotBlank
    private String recImg3;

    @NotBlank
    private String recDesc3;

    //	뷰수 필요 x
    //	@NotBlank
    //	private date recDate;
    //	private int recView;

    //(recten 은 0 아님 1로!)
    @NotBlank
    private int recTen;

    //도메인 객체로 보낼
    public Recipe toEntity() {
        return Recipe.builder()
                .recNum(recNum)
                .cateNum(cateNum)
                .recTitle(recTitle)
                .recSubt(recSubt)
                .recImg0(recImg0)
                .recDesc0(recDesc0)
                .recIngreMain(recIngreMain)
                .recIngreSub(recIngreSub)
                .recTool(recTool)
                .recImg1(recImg1)
                .recDesc1(recDesc1)
                .recImg2(recImg2)
                .recDesc2(recDesc2)
                .recImg3(recImg3)
                .recDesc3(recDesc3)
                .recTen(recTen)
                .build();
    }


}
