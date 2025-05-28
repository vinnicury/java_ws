package com.javalearn.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalearn.learn.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
