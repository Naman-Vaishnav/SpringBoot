package com.ncv.testWebApp.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ncv.testWebApp.Model.Product;

@Service
public class ProductService {
    List<Product> products=Arrays.asList(new Product(1, "P1", 10),new Product(2, "P2", 20));


    public List<Product> getProductus(){
        return products;
    }
}
