package com.emart.repository;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.emart.dto.CustomerDTO;
import com.emart.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Customer save(CustomerDTO customerDTO);

	Customer findByCustomerId(long customerId);

	Customer findByCustomerName(String customerName);
	
  
	//@Query("SELECT c FROM Customer c WHERE "+"c.customerNmae LIKE CONCAT('%', :query, '%'))"
	//+" Or c.customerEmail LIKE CONCAT('%', :query, '%')"		)
	
	@Query("SELECT r FROM Customer r WHERE r.customerName LIKE %?1%")

	List<Customer> searchCustomer(String query);

	//Page<Customer> findAll(Pageable pageable);

	//Page<CustomerDTO> findAll(Pageable pageable);

	//Page<CustomerDTO> findAll(Pageable pageable);
 }


//	@Query("SELECT r FROM Restaurant r WHERE r.restaurantCity LIKE %?1%")
