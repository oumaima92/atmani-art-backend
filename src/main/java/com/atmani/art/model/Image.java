package com.atmani.art.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String altText;
    private boolean isPrimary;
    @CreatedDate
    private LocalDateTime uploadedAt;
    @Column(columnDefinition = "TEXT") // To avoid storing it by default as a varchar of length 255
    private String data;

    public Image(Long id, String altText, boolean isPrimary, LocalDateTime uploadedAt, String data) {
        this.id = id;
        this.altText = altText;
        this.isPrimary = isPrimary;
        this.uploadedAt = uploadedAt;
        this.data = data;
    }

    public Image() {
    }

    public Long getId() {
        return id;
    }

    public String getAltText() {
        return altText;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public LocalDateTime getUploadedAt() {
        return uploadedAt;
    }

    public String getData() {
        return data;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    public void setPrimary(boolean primary) {
        isPrimary = primary;
    }

    public void setUploadedAt(LocalDateTime uploadedAt) {
        this.uploadedAt = uploadedAt;
    }

    public void setData(String data) {
        this.data = data;
    }
}
