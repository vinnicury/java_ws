package com.javalearn.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalearn.learn.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
