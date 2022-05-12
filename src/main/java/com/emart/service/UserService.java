package com.emart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emart.dto.UserDTO;
import com.emart.exception.BadRequestException;
import com.emart.model.User;

 @Service
public interface UserService {

	// User saveUser(User user);
	 
	 UserDTO saveUserDetails(UserDTO userDTO) throws BadRequestException;

	 
	 UserDTO findByUserId(int userId) throws BadRequestException;

	  List<UserDTO> findByAllUser();

}
