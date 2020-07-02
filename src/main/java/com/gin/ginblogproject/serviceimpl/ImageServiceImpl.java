package com.gin.ginblogproject.serviceimpl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gin.ginblogproject.mapper.ImageMapper;
import com.gin.ginblogproject.model.DTO.ImageDTO;
import com.gin.ginblogproject.model.entity.Image;
import com.gin.ginblogproject.service.IImageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl extends ServiceImpl<ImageMapper,Image> implements IImageService {


    @Override
    public Page<Image> query(Integer currentPage, Integer pageSize, String keyword) {
        if (currentPage==null||pageSize==null){
            return null;
        }


        Page page=new Page(currentPage,pageSize);


        return null;
    }
}
