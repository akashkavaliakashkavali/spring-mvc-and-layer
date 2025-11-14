package com.akash.simplewebapp.Service;

import com.akash.simplewebapp.Model.Product;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;
@Service

public class Productservice {

    List<Product> products = Arrays.asList(
            new Product (101, "Samsung", 50000),
            new Product (102, "Vivo", 30000),
            new Product (103, "redmi", 20000));


    public List<Product> getProducts(){
        return products;
    }
}
