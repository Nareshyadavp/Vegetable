package com.emart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emart.dto.OrderDTO;
import com.emart.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/createOreder")
	public ResponseEntity<OrderDTO> save(@RequestBody OrderDTO orderDTO){
		return new ResponseEntity<OrderDTO>(orderService.save(orderDTO),HttpStatus.CREATED);
		
	}

}
