package com.emart.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orderitems_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderVegetable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "quantity")
	private @NotNull int quantity;

	@Column(name = "itemName")
	private @NotNull String itemName;

	@Column(name = "available_quantity")
	private @NotNull int availableQuantity;

	@Column(name = "price")
	private @NotNull int price;

	@Column(name = "created_date")
	private Date createdDate;

	private double total;

//	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//
//	@JoinColumn(name = "order_id")
//	private Order order;
}