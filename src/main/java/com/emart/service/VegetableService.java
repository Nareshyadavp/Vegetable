package com.emart.service;

import org.springframework.stereotype.Service;

import com.emart.dto.VegetableDTO;
import com.emart.exception.BadRequestException;

@Service
public interface VegetableService {
	
	  VegetableDTO saveVegetable(VegetableDTO vegetableDTO);
	

	  VegetableDTO findByVegId(long id) throws BadRequestException ;
	  
}
