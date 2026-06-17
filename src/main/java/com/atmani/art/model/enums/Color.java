package com.atmani.art.model.enums;

public enum Color {
    RED("RED"),

    BLUE("BLUE"),

    GREEN("GREEN"),

    BLACK("BLACK"),

    WHITE("WHITE"),

    YELLOW("YELLOW"),

    PURPLE("PURPLE"),

    OTHER("OTHER");

    private String value;

    Color(String value) {
        this.value = value;
    }
}