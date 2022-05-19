package com.emart.service;

import org.springframework.stereotype.Service;

import com.emart.dto.OrderVegetableDTO;

@Service
public interface OrderVegetableService {
	
	OrderVegetableDTO save(OrderVegetableDTO orderVegetableDTO);
	
	

}
