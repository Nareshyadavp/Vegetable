package com.emart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emart.dto.CustomerDTO;
import com.emart.exception.BadRequestException;
import com.emart.model.Customer;
import com.emart.service.CustomerService;

@RestController

public class CustomerController {

	@Autowired
	CustomerService customerService;

	@PostMapping("/create")

	public ResponseEntity<CustomerDTO> saveCustomerDetails(

			@RequestBody CustomerDTO customerDTO) throws BadRequestException {
		try {
			customerDTO = customerService.saveCustomerDetails(customerDTO);
		} catch (BadRequestException e) {
			throw new BadRequestException("Failed to save customer details");
		}
		return new ResponseEntity<>(customerDTO, HttpStatus.CREATED);

	}

	@GetMapping("/{customerId}")
	public ResponseEntity<CustomerDTO> getCustomerId(@PathVariable long customerId) throws BadRequestException {
		CustomerDTO customerDTO = null;
		try {
			customerDTO = customerService.getSaveCustomer(customerId);
			if (customerDTO != null) {
				return new ResponseEntity<>(customerDTO, HttpStatus.OK);
			} else {
				throw new BadRequestException();
			}
		} catch (BadRequestException e) {
			throw new BadRequestException("customer id is not matched please enter correct " + customerId);

		}
	}

	@GetMapping("get/{customerName}")
	public ResponseEntity<CustomerDTO> getCustomerName(@PathVariable String customerName) throws BadRequestException {
		CustomerDTO customerDTO = null;
		try {
			customerDTO = customerService.getCustomerName(customerName);
			if (customerDTO != null) {
				return new ResponseEntity<>(customerDTO, HttpStatus.OK);

			} else {
				throw new BadRequestException();
			}

		} catch (BadRequestException e) {
			throw new BadRequestException("customer name is not matched please enter correct " + customerName);

		}
	}

	@GetMapping("/search")
	public ResponseEntity<List<Customer>> searchCustomer(@RequestParam(value = "query") String query)
			throws BadRequestException {

		List<Customer> customerDTOs = customerService.searchCustomer(query);
		return new ResponseEntity<List<Customer>>(customerDTOs, HttpStatus.OK);

	}
}
