package com.atmani.art.controller;

import atmani.art.project.v1.model.ImageDTO;
import com.atmani.art.model.Image;
import com.atmani.art.service.ImageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ImageController {
    private ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping("/images")
    public ResponseEntity<ImageDTO> addImage(@RequestBody Image image) {
        ImageDTO imageDTO = imageService.addImage(image);
        return ResponseEntity.status(HttpStatus.CREATED).body(imageDTO);
    }

    @GetMapping("images/{id}")
    public ResponseEntity<Image> getImageById(@PathVariable Long id) {
        return ResponseEntity.ok(imageService.getImageById(id));
    }
}
