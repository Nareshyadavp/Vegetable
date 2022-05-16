package com.emart.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

 
import lombok.Data;

@Data
public class CustomerDTO {
	private long customerId;

	private String customerPassword;

	private String customerName;

	private long customerMobileNo;
	private String customerAddress;

	@Email
	@NotEmpty
	private String customerEmail;

}
