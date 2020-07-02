package com.gin.ginblogproject.model.DTO;

import com.gin.ginblogproject.model.entity.Image;
import lombok.Data;

@Data
public class ImageDTO extends Image {

    private String sourceName;
}
