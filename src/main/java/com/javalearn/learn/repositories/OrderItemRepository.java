package com.javalearn.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.javalearn.learn.entities.OrderItem;
import com.javalearn.learn.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

    @Modifying
@Query("DELETE FROM OrderItem oi WHERE oi.id.order.id IN (SELECT o.id FROM Order o WHERE o.client.id = :clientId)")
void deleteAllItemsByClientId(@Param("clientId") Long clientId);


}
