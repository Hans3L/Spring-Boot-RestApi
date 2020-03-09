package com.creativity.microservice.categoriesservice.controllers;

import com.creativity.microservice.categoriesservice.models.Categorias;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriesController {
    @GetMapping
    public List<Object> list(){
        return Arrays.asList(new Categorias(1L,"Jabon"),
                             new Categorias(2L,"Perfume"),
                             new Categorias(3L,"Toalla"));
    }
}
