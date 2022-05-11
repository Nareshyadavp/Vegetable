package com.emart.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

 
 import lombok.Data;
 
 
 public class UserDTO {

	private Long userId;
	@NotEmpty
	private String userName;
	 
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@NotEmpty
	private String userMobile;
	@Email
	@NotEmpty
	private String userEmail;

	
	//private String userAddress;

}