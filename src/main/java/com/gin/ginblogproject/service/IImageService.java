package com.gin.ginblogproject.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gin.ginblogproject.model.DTO.ImageDTO;
import com.gin.ginblogproject.model.entity.Image;

import java.util.List;

public interface IImageService extends IService<Image> {

    /**
     * @param currentPage 当前页
     * @param pageSize    页码
     * @param keyword     关键词
     * @return
     * @description 分页查询同人图
     * @author suewong
     * @date 2020/6/30 9:24
     */
    Page<Image> query(Integer currentPage, Integer pageSize, String keyword);
}
