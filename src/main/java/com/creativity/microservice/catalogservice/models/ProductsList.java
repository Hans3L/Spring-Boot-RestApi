package com.creativity.microservice.catalogservice.models;

import java.util.List;

public class ProductsList {

    private List<Product> products;

    public ProductsList(){

    }

    public ProductsList(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
