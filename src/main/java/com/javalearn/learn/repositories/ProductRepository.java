package com.javalearn.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalearn.learn.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
