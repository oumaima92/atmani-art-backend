package com.atmani.art.mapper;

import atmani.art.project.v1.model.CategoryDTO;
import com.atmani.art.model.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    private ImageMapper imageMapper;
    public CategoryMapper(ImageMapper imageMapper) {
        this.imageMapper = imageMapper;
    }
    public CategoryDTO toDto(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setDescription(category.getDescription());
        categoryDTO.setName(category.getName());
        categoryDTO.setId(category.getId());
        categoryDTO.setCategoryImage(imageMapper.toImageDTO(category.getCategoryImage()));
        return categoryDTO;
    }
}
