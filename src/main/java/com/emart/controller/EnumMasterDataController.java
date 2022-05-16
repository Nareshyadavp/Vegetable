package com.emart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.emart.dto.EnumMasterDataDTO;
import com.emart.service.EnumMasterDataService;

@RestController
public class EnumMasterDataController {
	
	@Autowired
	private EnumMasterDataService enumMasterDataService;
	
	@GetMapping("/enum/{enumType}")
	public List<EnumMasterDataDTO> getAllenunApi(@PathVariable ("enumType") String enumType){
		return enumMasterDataService.getEnumMasterDataApi(enumType.toLowerCase());
 		
	}
	
	

}
