package com.atmani.art.controller;

import atmani.art.project.v1.api.CategoriesApi;
import atmani.art.project.v1.model.CategoryDTO;
import com.atmani.art.repo.CategoriesRepo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriesController implements CategoriesApi {
    private CategoriesRepo categoriesRepo;

    public CategoriesController(CategoriesRepo categoriesRepo) {
        this.categoriesRepo = categoriesRepo;
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
    public ResponseEntity<CategoryDTO> addCategory(CategoryDTO category) {
        return null;
    }
}
