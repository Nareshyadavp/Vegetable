package com.emart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emart.dto.StoreCardDTO;
 
@Service
public interface StoreCardService{
	
	StoreCardDTO save(StoreCardDTO storeCardDTO);
	
	List<StoreCardDTO> getAll();
	
	

}
