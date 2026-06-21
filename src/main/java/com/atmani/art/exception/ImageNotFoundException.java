package com.atmani.art.exception;

public class ImageNotFoundException extends RuntimeException {
    public ImageNotFoundException(Long id) {
        super("Image not found with id: " + id);
    }
}
