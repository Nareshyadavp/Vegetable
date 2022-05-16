package com.emart.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.emart.dto.VegetableDTO;
import com.emart.exception.BadRequestException;

 
@Service
public interface VegetableService {
	
	  VegetableDTO saveVegetable(VegetableDTO vegetableDTO) throws BadRequestException;
	

	  VegetableDTO getVegId(int vegId) throws BadRequestException ;
	  
	  VegetableDTO updateVegetable(VegetableDTO vegetableDTO);
 

	List<VegetableDTO> getAll();
	  
}
