package com.creativity.microservice.catalogservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CategoriesService {

    @Autowired
    private RestTemplate restTemplate; //resuelve la comunicacion entre servicios

}
