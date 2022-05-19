package com.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emart.model.StoreCard;

public interface StoreCardRepository extends JpaRepository<StoreCard, Long> {

}
