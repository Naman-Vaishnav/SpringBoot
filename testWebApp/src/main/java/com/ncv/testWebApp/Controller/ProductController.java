package com.ncv.testWebApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncv.testWebApp.Model.Product;
import com.ncv.testWebApp.Service.ProductService;

import jakarta.websocket.server.PathParam;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts(){
       return productService.getProductus();
    }

    @GetMapping("/products/{ID}")
    public Product getProductById(@PathVariable("ID") int id){
        return productService.getProductById(id);
    }

    @PostMapping("/product")
    public String addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return "Product added!!";
    }

}
