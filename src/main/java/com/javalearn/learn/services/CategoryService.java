package com.javalearn.learn.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalearn.learn.entities.Category;
import com.javalearn.learn.repositories.CategoryRepository;


@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;
    public List<Category> findAll() {
        return repository.findAll();

    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
