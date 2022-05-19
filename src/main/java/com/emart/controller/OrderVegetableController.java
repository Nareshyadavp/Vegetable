package com.emart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emart.dto.OrderVegetableDTO;
import com.emart.service.OrderVegetableService;

@RestController
public class OrderVegetableController {
	
	@Autowired
	private OrderVegetableService orderVegetableService;
	
	
	@PostMapping("/createordervegetable")
	public ResponseEntity<OrderVegetableDTO> save(@RequestBody OrderVegetableDTO vegetableDTO){
		return new ResponseEntity<OrderVegetableDTO>(orderVegetableService.save(vegetableDTO), HttpStatus.CREATED);
		
	}
	

}
