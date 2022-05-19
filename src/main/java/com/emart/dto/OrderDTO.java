package com.emart.dto;

import java.util.Date;
import java.util.List;

import com.emart.model.Customer;
import com.emart.model.OrderVegetable;

import lombok.Data;

@Data
public class OrderDTO {

	private long id;

	private Date createdDate;

	private double totalPrice;
	private String shippingAddress;
	private String paymentMode;

	//private Customer customer;
	private List<OrderVegetable> orderVegetables;
}
