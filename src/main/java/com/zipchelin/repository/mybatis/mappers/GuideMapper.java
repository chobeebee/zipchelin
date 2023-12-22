package com.zipchelin.repository.mybatis.mappers;

import com.zipchelin.domain.admin.Guide;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GuideMapper {
    void addGuide(Guide guide);

    void selectGuideAll();

    void updateGuide(Guide guide);

    void delGuide(int guiNum);
}
