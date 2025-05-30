package com.javalearn.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalearn.learn.entities.OrderItem;
import com.javalearn.learn.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
