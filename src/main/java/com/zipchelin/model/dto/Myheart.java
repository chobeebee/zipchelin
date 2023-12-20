package com.zipchelin.model.dto;

import com.zipchelin.domain.Guide;
import com.zipchelin.domain.Recipe;
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
