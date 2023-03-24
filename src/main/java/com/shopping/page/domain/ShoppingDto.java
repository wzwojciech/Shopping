package com.shopping.page.domain;

public class ShoppingDto {
    private Integer id;

    private String name;

    private String description;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ShoppingDto(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}