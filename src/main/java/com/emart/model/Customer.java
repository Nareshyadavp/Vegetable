package com.emart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "customer_details") 
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerId;

	@Column(name = "cus_pass", nullable = false)
	private String customerPassword;

	@Column(name = "cus_name", nullable = false)
	private String customerName;

	@Column(name = "cus_mobile", nullable = false)
	private long customerMobileNo;

	@Column(name = "cus_add", nullable = false)
	private String customerAddress;

	@Column(name = "cus_email", nullable = false)
	@Email
	private String customerEmail;

}
