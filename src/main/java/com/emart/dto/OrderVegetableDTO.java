package com.emart.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.emart.model.Order;

import lombok.Data;

@Data
public class OrderVegetableDTO{

	private long id;

	private @NotNull int quantity;

	private @NotNull String itemName;

	private @NotNull int availableQuantity;

	private @NotNull int price;

	private Date createdDate;

	private double total;
	
	private Order order;

}