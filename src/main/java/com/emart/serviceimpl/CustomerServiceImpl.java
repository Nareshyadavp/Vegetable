package com.emart.serviceimpl;

import java.util.List;


import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.dto.CustomerDTO;
import com.emart.exception.BadRequestException;
import com.emart.model.Customer;
import com.emart.repository.CustomerRepository;
import com.emart.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	@Transactional
	public CustomerDTO saveCustomerDetails(CustomerDTO customerDTO) throws BadRequestException {
		Customer customer = modelMapper.map(customerDTO, Customer.class);
		customer = customerRepository.save(customer);
		return modelMapper.map(customer, CustomerDTO.class);

	}

	@Override
	public CustomerDTO getSaveCustomer(long customerId) throws BadRequestException {
		CustomerDTO customerDTO = null;
		Customer customer = customerRepository.findByCustomerId(customerId);
		if (customer != null)
			customerDTO = modelMapper.map(customer, CustomerDTO.class);
		return customerDTO;

	}

	@Override
	public CustomerDTO getCustomerName(String customerName) throws BadRequestException {
		CustomerDTO customerDTO = null;
		Customer customer = customerRepository.findByCustomerName(customerName);
		if (customer != null)
			customerDTO = modelMapper.map(customer, CustomerDTO.class);
		return customerDTO;

	}

	@Override
	public List<Customer> searchCustomer(String query) throws BadRequestException {
		List<Customer> dtos = customerRepository.searchCustomer(query);
		return dtos;
	}

	

}
