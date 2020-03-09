package com.creativity.microservice.catalogservice.models;

public class Product {
    private String code;
    private String name;
    private double price;
    private Long categoryId;

    public Product(String code, String name, double price, Long categoryId) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
