package com.atmani.art.controllers;

import com.atmani.art.repo.CategoriesRepo;
import com.atmani.art.v1.api.CategoriesApi;
import com.atmani.art.v1.model.CategoryDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class CategoriesController implements CategoriesApi {
    private CategoriesRepo categoriesRepo;

    public CategoriesController(CategoriesRepo categoriesRepo) {
        this.categoriesRepo = categoriesRepo;
    }

    @Override
    public ResponseEntity<List<CategoryDTO>> getCategories() {
        return ResponseEntity.ok(categoriesRepo.findAll());
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
