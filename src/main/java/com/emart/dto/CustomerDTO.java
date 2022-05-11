package com.emart.dto;

import javax.validation.constraints.Email;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
public class CustomerDTO {
	private long customerId;

	private String customerPassword;

	private String customerName;

	private long customerMobileNo;
	private String customerAddress;

	@Email
	@NotNull
	private String customerEmail;

}
