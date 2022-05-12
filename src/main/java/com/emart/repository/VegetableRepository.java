package com.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emart.dto.VegetableDTO;
import com.emart.model.Vegetable;

public interface VegetableRepository  extends JpaRepository<Vegetable, Integer>{

	Vegetable save(VegetableDTO vegetableDTO);
	
	
	Vegetable findByVegId(int vegId);
	
	
	
 }
