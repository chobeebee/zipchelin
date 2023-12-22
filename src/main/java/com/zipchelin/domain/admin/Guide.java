package com.zipchelin.domain.admin;

import com.zipchelin.model.dto.member.mypage.Myheart;
import com.zipchelin.model.dto.admin.guide.GuideRequestDto;
import com.zipchelin.model.dto.admin.guide.GuideResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.sql.Date;

@Getter
@Builder
@AllArgsConstructor
public class Guide {
    private int guiNum;
    private int cateNum;
    private Date guiDate;
    private int guiView;
    private String guiTitle;
    private String guiSubt;
    private String guiDesc;
    private String guiThumb; //임시

    private int guiImgId;
    private String guiImgFileName;
    private int guiImgNo;

    private int guiTextId;
    private String guiText;
    private int guiTextNo;

    public GuideResponseDto toDto() {
        return GuideResponseDto.builder()
                .guiTitle(guiTitle)
                .guiSubt(guiSubt)
                .guiThumb(guiThumb)
                .build();
    }

    public GuideRequestDto fromDto() {
        return GuideRequestDto.builder()
                .guiNum(guiNum)
                .cateNum(cateNum)
                .guiTitle(guiTitle)
                .guiSubt(guiSubt)
                .guiThumb(guiThumb)
                .build();
    }

    public Myheart toMyheart() {
        return Myheart.builder()
                .guiOrRec("gui")
                .heartDate(guiDate)
                .recipe(null)
                .guide(this)
                .build();
    }

}
