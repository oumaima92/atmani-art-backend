package com.atmani.art.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @OneToOne
    @JoinColumn(name = "image_id")
    private Image categoryImage;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> productList;
    @CreatedDate
    private Date creationDate;
    @LastModifiedDate
    private Date modificationDate;

    public Category() {
    }

    public Category(Long id, String name, String description, List<Product> productList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.productList = productList;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Image getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(Image categoryImage) {
        this.categoryImage = categoryImage;
    }
}
