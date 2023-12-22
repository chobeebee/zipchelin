package com.zipchelin.model.dto.member.mypage;

import com.zipchelin.domain.admin.Guide;
import com.zipchelin.domain.admin.Recipe;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Builder
@Getter
public class Myheart {

    private String guiOrRec;
    private Date heartDate;
    private Guide guide;
    private Recipe recipe;
}
