package com.springMVC.web.service;

import com.springMVC.web.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> findAllCategories();
}

