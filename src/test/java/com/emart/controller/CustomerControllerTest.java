package com.emart.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.emart.dto.CustomerDTO;
import com.emart.exception.BadRequestException;
import com.emart.service.CustomerService;

@RunWith(SpringRunner.class)
public class CustomerControllerTest {

	@Mock
	private CustomerService customerServiceMock;

	@InjectMocks
	private CustomerController customerControllerMock;

	
	@Test
	public void saveCustomerDetailsTest() throws BadRequestException {
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerAddress("address");
		customerDTO.setCustomerId(1);
		when(customerServiceMock.saveCustomerDetails(customerDTO)).thenReturn(customerDTO);
		ResponseEntity<CustomerDTO> responseEntity = customerControllerMock.saveCustomerDetails(customerDTO);
		assertEquals(HttpStatus.CREATED.value(), responseEntity.getStatusCodeValue());
	}

}
