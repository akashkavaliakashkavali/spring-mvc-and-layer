package com.akash.simplewebapp.Service;

import com.akash.simplewebapp.Model.Product;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service

public class Productservice {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product (101, "Samsung", 50000),
            new Product (102, "Vivo", 30000),
            new Product (103, "redmi", 20000)));


    public List<Product> getProducts(){
        return products;
    }

    public Product getProductbyId(int prodId){
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Product(100, "No item",0));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index=0;

        for(int i=0;i<products.size();i++)
            if(products.get(i).getProdId() == prod.getProdId())
                index = i;
        products.set(index,prod);
    }

    public void deleteProduct(int prodId) {
        int index=0;

        for(int i=0;i<products.size();i++)
            if(products.get(i).getProdId() == prodId)
                index = i;
        products.remove(index);
    }
}
