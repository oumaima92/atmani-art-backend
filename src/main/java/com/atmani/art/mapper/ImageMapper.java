package com.atmani.art.mapper;

import atmani.art.project.v1.model.ImageDTO;
import com.atmani.art.model.Image;
import org.springframework.stereotype.Component;

@Component
public class ImageMapper {
    public ImageDTO toImageDTO(Image image) {
        ImageDTO imageDTO = new ImageDTO();
        imageDTO.setUrl("localhost:8080/images/" + image.getId()); //TODO
        imageDTO.setAltText(image.getAltText());
        imageDTO.setIsPrimary(image.isPrimary());
        return imageDTO;
    }

    public Image toImage(ImageDTO imageDTO) {
        Image image = new Image();
        image.setAltText(imageDTO.getAltText());
        image.setPrimary(Boolean.TRUE.equals(imageDTO.getIsPrimary()));
        return image;
    }
}
