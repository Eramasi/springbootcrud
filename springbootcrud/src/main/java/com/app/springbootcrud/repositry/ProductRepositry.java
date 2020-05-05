package com.app.springbootcrud.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springbootcrud.entity.Product;

public interface ProductRepositry extends JpaRepository<Product,Integer> {

}
