package com.atmani.art.controller;

import atmani.art.project.v1.api.CategoriesApi;
import atmani.art.project.v1.model.CategoryDTO;

import com.atmani.art.model.Image;
import com.atmani.art.service.CategoriesService;
import com.atmani.art.service.ImageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController implements CategoriesApi {
    private CategoriesService categoriesService;
    private ImageService imageService;

    public CategoryController(CategoriesService categoriesService, ImageService imageService) {
        this.categoriesService = categoriesService;
        this.imageService = imageService;
    }

    @Override
    public ResponseEntity<List<CategoryDTO>> getCategories() {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteCategoryById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<CategoryDTO> getCategoryById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<CategoryDTO> updateCategory(Long id, CategoryDTO category) {
        return null;
    }

    @Override
    public ResponseEntity<CategoryDTO> addCategory(CategoryDTO categoryDto) {
        Image categoryImage = imageService.getImageById(categoryDto.getCategoryImage().getId());
        CategoryDTO created = categoriesService.addCategory(categoryDto, categoryImage);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }
}
