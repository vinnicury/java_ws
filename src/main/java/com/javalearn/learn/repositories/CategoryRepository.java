package com.javalearn.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalearn.learn.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
