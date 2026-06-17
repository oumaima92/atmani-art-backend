package com.atmani.art.repo;

import atmani.art.project.v1.model.CategoryDTO;
import com.atmani.art.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepo extends JpaRepository<Category, Long> {

}
