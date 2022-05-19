package com.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emart.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {

}
