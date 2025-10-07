package com.ncv.testWebApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ncv.testWebApp.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
