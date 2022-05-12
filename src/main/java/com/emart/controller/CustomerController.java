package com.emart.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emart.dto.CustomerDTO;
import com.emart.exception.BadRequestException;
import com.emart.model.Customer;
import com.emart.repository.CustomerRepository;
import com.emart.service.CustomerService;

@RestController

public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@Autowired
	private CustomerRepository customerRepository;

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

	@GetMapping("/list")
	public ResponseEntity<List<CustomerDTO>> getAll() {
		List<CustomerDTO> list = customerService.getAll();
		return new ResponseEntity<List<CustomerDTO>>(list, HttpStatus.OK);
		

	}

	@PutMapping("/user/{customerId}")
	public ResponseEntity<CustomerDTO> updateUser( @PathVariable Long customerId, @RequestBody @Valid CustomerDTO customerDTO
			)throws BadRequestException{
		
		if(! customerRepository.existsById(customerId)) {
			throw new BadRequestException("Failed to update Customerdetails ");
		}
		customerDTO=customerService.updateUser(customerDTO);
		return new ResponseEntity< >(customerDTO,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/CustomerList")
	public ResponseEntity<List<Customer>>  getAllPages(
			@RequestParam (defaultValue = "0") Integer pageNo,
			@RequestParam(defaultValue = "10") Integer pageSize){
		
		List<Customer> customer=customerService.getAllPaginationCustomer(pageNo, pageSize);
		return new ResponseEntity<List<Customer>>(customer, HttpStatus.OK);
		
	}
}
