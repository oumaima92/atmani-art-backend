package com.atmani.art.model;

import com.atmani.art.model.enums.Color;
import com.atmani.art.model.enums.Shape;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    private List<Image> productImages;
    private String description;
    @ManyToOne
    private Category category;
    private Shape shape;
    private Long price;
    private List<Color> colors;
    @CreatedDate
    private Date creationDate;
    @LastModifiedDate
    private Date modificationDate;

    public Product() {
    }

    public Product(Long id, String name, List<Image> productImages, String description, Category category, Shape shape, Long price, List<Color> colors, Date creationDate, Date modificationDate) {
        this.id = id;
        this.name = name;
        this.productImages = productImages;
        this.description = description;
        this.category = category;
        this.shape = shape;
        this.price = price;
        this.colors = colors;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Image> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<Image> productImages) {
        this.productImages = productImages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }
}
