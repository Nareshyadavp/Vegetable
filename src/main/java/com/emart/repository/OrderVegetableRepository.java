package com.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emart.model.OrderVegetable;

 
public interface OrderVegetableRepository extends JpaRepository<OrderVegetable, Long> {

}
