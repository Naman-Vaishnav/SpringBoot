package com.ncv.testWebApp.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncv.testWebApp.Model.Product;
import com.ncv.testWebApp.Repository.ProductRepository;

@Service
public class ProductService {
    //List<Product> products=new ArrayList<>(Arrays.asList(new Product(1, "P1", 10),new Product(2, "P2", 20)));
    
    @Autowired
    ProductRepository productRepository;

    public List<Product> getProductus(){
        return productRepository.findAll();
    }

    public Product getProductById(int id){
        return productRepository.findById(id).orElse(null);
    }

    public void addProduct(Product product){
       productRepository.save(product);
    }

    public void updateProduct(Product product) {
       productRepository.save(product);
    }

    public void deleteProduct(int id) {
       productRepository.deleteById(id);
    }
    
}
