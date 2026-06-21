package com.atmani.art.service;

import atmani.art.project.v1.model.CategoryDTO;
import com.atmani.art.exception.ImageNotFoundException;
import com.atmani.art.mapper.CategoryMapper;
import com.atmani.art.model.Category;
import com.atmani.art.model.Image;
import com.atmani.art.repo.CategoriesRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class CategoriesService {
    CategoriesRepo categoriesRepo;
    CategoryMapper categoryMapper;
    RestTemplate restTemplate;

    public CategoriesService(CategoriesRepo categoriesRepo, CategoryMapper categoryMapper, RestTemplate restTemplate) {
        this.categoriesRepo = categoriesRepo;
        this.categoryMapper = categoryMapper;
        this.restTemplate = restTemplate;
    }
    public CategoryDTO addCategory(CategoryDTO categoryDTO, Image categoryImage) {
        Category category = categoryMapper.toEntity(categoryDTO);
        category.setCategoryImage(categoryImage);
        return categoryMapper.toDto(categoriesRepo.save(category));
    }
}
