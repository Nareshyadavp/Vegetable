package com.emart.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emart.dto.UserDTO;
import com.emart.model.User;
import com.emart.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("user/api/v1")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/usercreate")
	public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO userDTO) {
		return new ResponseEntity<>(userService.saveUser(userDTO), HttpStatus.OK);

	}

	@GetMapping("/getall")
	public ResponseEntity<List<UserDTO>> getAll(){
		return new ResponseEntity<List<UserDTO>>(userService.findByAllUser(),HttpStatus.OK);
		
	}
	@PostMapping("/userentity")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
		//return new ResponseEntity<>(userService.saveUser(user), HttpStatus.OK);

	}
	
}
