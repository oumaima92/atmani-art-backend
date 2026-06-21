package com.atmani.art.repo;

import atmani.art.project.v1.model.ImageDTO;
import com.atmani.art.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageRepo extends JpaRepository<Image, Long> {
    Optional<Image> getImageById(Long id);
}
