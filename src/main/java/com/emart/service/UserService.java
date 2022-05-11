package com.emart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emart.dto.UserDTO;
import com.emart.model.User;

 
public interface UserService {

	 User saveUser(User user);
	 
	 UserDTO saveUser(UserDTO userDTO);


	public List<UserDTO> findByAllUser();

}
