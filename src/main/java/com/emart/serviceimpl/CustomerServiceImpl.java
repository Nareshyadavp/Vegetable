package com.emart.serviceimpl;

import org.springframework.data.domain.Pageable;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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

	@Override
	public List<CustomerDTO> getAll() {
		List<CustomerDTO> customerDTOs = new ArrayList<>();
		List<Customer> customers = (List<Customer>) customerRepository.findAll();
		for (Customer customer : customers) {
			CustomerDTO customerDTO = modelMapper.map(customer, CustomerDTO.class);
			customerDTOs.add(customerDTO);
		}
		return customerDTOs;
	}

	@Override
	public CustomerDTO updateUser(CustomerDTO customerDTO) {

		Customer customer = modelMapper.map(customerDTO, Customer.class);
		customer = customerRepository.save(customer);
		return modelMapper.map(customer, CustomerDTO.class);
	}

//	@Override
//	public List<CustomerDTO> getAllPagination(int pageNo, int pageSize) {
//		Pageable pageable =  PageRequest.of(pageNo, pageSize);
//		Page<CustomerDTO> pageResult = customerRepository.findAll(pageable);
//		if (pageResult.hasContent()) {
//			return pageResult.getContent();
//
//		} else {
//			return new ArrayList<>();
//		}
//	}

	@Override
	public List<Customer> getAllPaginationCustomer(int pageNo, int pageSize) {
		Pageable paging= PageRequest.of(pageNo, pageSize);
		
		Page<Customer> pageResult = customerRepository.findAll(paging);
		if(pageResult.hasContent()) {
			return pageResult.getContent();
		}else {
			return new ArrayList<Customer>();
		}
		
		
	}

	 
		


}
