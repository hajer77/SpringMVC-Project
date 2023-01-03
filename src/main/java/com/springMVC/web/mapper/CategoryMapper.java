package com.springMVC.web.mapper;

import com.springMVC.web.dto.CategoryDto;
import com.springMVC.web.models.Category;

public class CategoryMapper {
    public static CategoryDto mapToCategoryDto(Category category){
        CategoryDto categoryDto = CategoryDto.builder()
                .id(category.getId())
                .name(category.getName())
                .photoUrl(category.getPhotoUrl())
                .content(category.getContent())
                .createdOn(category.getCreatedOn())
                .updatedOn(category.getUpdatedOn())
                .build();
                return categoryDto;
    }
}
