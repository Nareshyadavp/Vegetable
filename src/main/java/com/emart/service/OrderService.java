package com.emart.service;

import org.springframework.stereotype.Service;

import com.emart.dto.OrderDTO;

@Service
public interface OrderService {

	OrderDTO save(OrderDTO orderDTO);

}
