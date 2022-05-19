package com.emart.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.dto.OrderDTO;
import com.emart.model.Order;
import com.emart.repository.OrderRepository;
import com.emart.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public OrderDTO save(OrderDTO orderDTO) {
		Order order = modelMapper.map(orderDTO, Order.class);
		order = orderRepository.save(order);

		return modelMapper.map(order, OrderDTO.class);
	}

}
