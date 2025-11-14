package com.akash.simplewebapp.Controller;

import com.akash.simplewebapp.Model.Product;
import com.akash.simplewebapp.Service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Productcontroller {

    @Autowired
    Productservice service;


    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
}
