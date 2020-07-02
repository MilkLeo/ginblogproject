package com.gin.ginblogproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gin.ginblogproject.model.entity.Image;

public interface ImageMapper extends BaseMapper<Image> {
    int deleteByPrimaryKey(Integer id);

    int insert(Image record);

    int insertSelective(Image record);

    Image selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Image record);

    int updateByPrimaryKey(Image record);
}