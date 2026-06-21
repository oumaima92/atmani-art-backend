package com.atmani.art.service;

import atmani.art.project.v1.model.ImageDTO;
import com.atmani.art.exception.ImageNotFoundException;
import com.atmani.art.mapper.ImageMapper;
import com.atmani.art.model.Image;
import com.atmani.art.repo.ImageRepo;
import org.springframework.stereotype.Service;

@Service
public class ImageService {
    private ImageRepo imageRepo;
    private ImageMapper imageMapper;
    public ImageService(ImageRepo imageRepo, ImageMapper imageMapper) {
        this.imageRepo = imageRepo;
        this.imageMapper = imageMapper;
    }
    public ImageDTO addImage(Image image) {
        imageRepo.save(image);
        return imageMapper.toImageDTO(image);
    }

    public Image getImageById(Long id) {
        return imageRepo.getImageById(id)
                .orElseThrow(() -> new ImageNotFoundException(id));
    }
}
