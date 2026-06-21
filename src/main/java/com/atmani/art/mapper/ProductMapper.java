package com.atmani.art.mapper;

import atmani.art.project.v1.model.CategoryDTO;
import atmani.art.project.v1.model.ProductDTO;
import com.atmani.art.model.Category;
import com.atmani.art.model.Product;
import com.atmani.art.model.enums.Color;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class ProductMapper {
    private ImageMapper imageMapper;

    public ProductMapper(ImageMapper imageMapper) {
        this.imageMapper = imageMapper;
    }

    public ProductDTO toProductDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductImages(product.getProductImages().stream().map(imageMapper::toImageDTO).collect(Collectors.toList()));
        productDTO.setColors(product.getColors().stream().map(Color::name).collect(Collectors.toList()));
        productDTO.setShape(product.getShape().name());
        productDTO.setPrice(product.getPrice());
        productDTO.setName(product.getName());
        productDTO.setCategoryName(product.getCategory().getName());
        productDTO.setDescription(product.getDescription());
        return productDTO;
    }
}
