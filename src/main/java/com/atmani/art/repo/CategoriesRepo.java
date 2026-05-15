package com.atmani.art.repo;
import com.atmani.art.v1.model.CategoryDTO;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepo extends JpaRepository<CategoryDTO, Long> {

}
