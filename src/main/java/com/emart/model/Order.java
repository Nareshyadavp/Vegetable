package com.emart.model;

import java.util.Date;
import java.util.List;

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

@Entity
@Table(name = "orders_deatails")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "total_price")
	private double totalPrice;
	@Column(name = "shipping_address")
	private String shippingAddress;
	@Column(name = "payment_mode")
	private String paymentMode;

//	// @JsonIgnore
//	@OneToMany(mappedBy = "order", orphanRemoval = true, cascade = CascadeType.REMOVE)

//	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	private List<OrderVegetable> orderVegetables;

//	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	@JoinColumn(name = "customer_id")
//	private Customer customer;
//
//	@OneToMany(mappedBy = "order", orphanRemoval = true, cascade = CascadeType.REMOVE)
//	private List<OrderVegetable> orderVegetables;

}