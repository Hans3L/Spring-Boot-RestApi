package com.creativity.microservice.categoriesservice.models;

import com.creativity.microservice.categoriesservice.models.Categorias;

import java.util.List;

public class CategoriesList {
public List<Categorias> categories;

public CategoriesList(){

    }

    public List<Categorias> getCategories() {
        return categories;
    }

    public void setCategories(List<Categorias> categories) {
        this.categories = categories;
    }

    public CategoriesList(List<Categorias> categories) {
        this.categories = categories;
    }
}
