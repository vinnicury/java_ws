package com.javalearn.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.javalearn.learn.entities.Order;

import jakarta.transaction.Transactional;

public interface OrderRepository extends JpaRepository<Order, Long> {
@Modifying
@Transactional
@Query("DELETE FROM Order o WHERE o.client.id = :clientId")
void deleteAllByClientId(@org.springframework.data.repository.query.Param("clientId") Long clientId);


}
