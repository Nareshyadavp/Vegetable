package com.emart.dto;

 
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.emart.model.StoreCard;

import lombok.Data;

@Data
public class CustomerDTO {
	private long customerId;

	private String customerPassword;

	private String customerName;
	
	@Pattern(regexp="^[7-9]{1}[0-9]{9}[a-zA-Z0-9\s]*$")
	private String customerMobileNo;
	private String customerAddress;

	@Email
	@NotEmpty
	private String customerEmail;
	private int age;
	private List<StoreCard> storeCards;


}
