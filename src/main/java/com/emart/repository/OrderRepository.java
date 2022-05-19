package com.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emart.model.Order;
import com.emart.model.OrderVegetable;

public interface OrderRepository extends JpaRepository<Order, Long> {

	OrderVegetable save(OrderVegetable orderVegetable);

}
