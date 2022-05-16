package com.emart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emart.dto.CustomerDTO;
import com.emart.exception.BadRequestException;
import com.emart.model.Customer;
public interface CustomerService {

	CustomerDTO saveCustomerDetails(CustomerDTO customerDTO) throws BadRequestException;

	CustomerDTO getSaveCustomer(long customerId) throws BadRequestException;

	CustomerDTO getCustomerName(String customerName) throws BadRequestException;

	List<Customer> searchCustomer(String query)throws BadRequestException;

	List<CustomerDTO> getAll();
	
	CustomerDTO updateUser(CustomerDTO customerDTO);
	
	//CustomerDTO postCustomerData( CustomerDTO customerDTO);
	
	
	//List<CustomerDTO> getAllPagination(int pageNo, int pageSize );
	
	List<Customer> getAllPaginationCustomer(int pageNo, int pageSize );
 
	
	
}



