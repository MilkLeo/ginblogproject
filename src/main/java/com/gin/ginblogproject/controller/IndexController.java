package com.gin.ginblogproject.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gin.ginblogproject.model.DTO.ImageDTO;
import com.gin.ginblogproject.model.entity.Image;
import com.gin.ginblogproject.model.responses.ResponseData;
import com.gin.ginblogproject.service.IImageService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private IImageService imageService;


    @ApiOperation(value = "")
    public ResponseData<Page<ImageDTO>> query(Integer page, Integer pagaSize, String keyword) {



    }


}
