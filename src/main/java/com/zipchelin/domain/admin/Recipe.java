package com.zipchelin.domain.admin;

import com.zipchelin.model.dto.mypage.Myheart;
import com.zipchelin.model.dto.admin.recipe.RecipeListRequestDto;
import com.zipchelin.model.dto.admin.recipe.RecipeListResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {

    //recipe_tbl
    private long recNum;
    private int cateNum;
    private String recTitle;
    private String recSubt;
    private String recImg0;
    private String recDesc0;
    private String recIngreMain;
    private String recIngreSub;
    private String recTool;
    private String recImg1;
    private String recDesc1;
    private String recImg2;
    private String recDesc2;
    private String recImg3;
    private String recDesc3;

    private Date recDate;
    private int recView;

    private int recTen;
    //private (String/int) userId; //리스트에서 하트?

    public RecipeListRequestDto fromDto() {
        return RecipeListRequestDto.builder()
        		.recNum(recNum)
				//.cateNum(cateNum)
				.recTitle(recTitle)
				.recSubt(recSubt)
                .build();
    }
    
    public RecipeListResponseDto toDto() {
        return RecipeListResponseDto.builder()
        		.recNum(recNum)
				//.cateNum(cateNum)
				.recTitle(recTitle)
				.recSubt(recSubt)
				//.recImg0(recImg0)
				.build();
    }

    public Myheart toMyheart() {
        return Myheart.builder()
                .guiOrRec("rec")
                .heartDate(recDate)
                .recipe(this)
                .guide(null)
                .build();
    }
}
