package com.javalearn.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalearn.learn.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
