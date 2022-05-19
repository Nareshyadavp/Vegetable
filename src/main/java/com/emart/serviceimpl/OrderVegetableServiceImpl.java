package com.emart.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.dto.OrderVegetableDTO;
import com.emart.model.OrderVegetable;
import com.emart.repository.OrderRepository;
import com.emart.service.OrderVegetableService;

@Service
public class OrderVegetableServiceImpl implements OrderVegetableService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public OrderVegetableDTO save(OrderVegetableDTO orderVegetableDTO) {
		OrderVegetable orderVegetable = modelMapper.map(orderVegetableDTO, OrderVegetable.class);
		orderVegetable = orderRepository.save(orderVegetable);

		return modelMapper.map(orderVegetable, OrderVegetableDTO.class);
	}

}
