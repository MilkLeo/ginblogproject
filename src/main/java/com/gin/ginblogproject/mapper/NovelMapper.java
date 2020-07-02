package com.gin.ginblogproject.mapper;

import com.gin.ginblogproject.model.entity.Novel;

public interface NovelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Novel record);

    int insertSelective(Novel record);

    Novel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Novel record);

    int updateByPrimaryKey(Novel record);
}