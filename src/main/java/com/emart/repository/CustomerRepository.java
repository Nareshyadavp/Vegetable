package com.emart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.emart.dto.CustomerDTO;
import com.emart.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	Customer save(CustomerDTO customerDTO);

	Customer findByCustomerId(long customerId);

	Customer findByCustomerName(String customerName);
	

	//@Query("SELECT c FROM Customer c WHERE "+"c.customerNmae LIKE CONCAT('%', :query, '%'))"
	//+" Or c.customerEmail LIKE CONCAT('%', :query, '%')"		)
	
	@Query("SELECT r FROM Customer r WHERE r.customerName LIKE %?1%")

	List<Customer> searchCustomer(String query);

}


//	@Query("SELECT r FROM Restaurant r WHERE r.restaurantCity LIKE %?1%")
