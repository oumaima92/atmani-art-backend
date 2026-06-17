package com.atmani.art.model.enums;

public enum Shape {
    CIRCULAR("Circular"),

    OVAL("Oval"),

    SQUARE_SHAPED("SquareShaped"),

    RECTANGULAR("Rectangular"),

    IRREGULAR("Irregular"),

    OTHER("Other");

    private String value;

    Shape(String value) {
        this.value = value;
    }
}

