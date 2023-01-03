package com.springMVC.web.service.Impl;


import com.springMVC.web.dto.CategoryDto;
import com.springMVC.web.models.Category;
import com.springMVC.web.repository.CategoryRepository;
import com.springMVC.web.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.springMVC.web.mapper.CategoryMapper.mapToCategoryDto;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDto> findAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream().map(category -> mapToCategoryDto(category)).collect(Collectors.toList());
    }




}
