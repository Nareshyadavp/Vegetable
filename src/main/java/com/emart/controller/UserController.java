package com.emart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emart.dto.UserDTO;
import com.emart.exception.BadRequestException;
import com.emart.service.UserService;

@RestController

public class UserController {

	@Autowired
	private UserService userService;

	// @PostMapping("/usercreate")

//	public ResponseEntity<UserDTO> saveUserDetails(
//
//			@RequestBody UserDTO userDTO) throws BadRequestException {
//		try {
//			userDTO = userService.saveUserDetails(userDTO);
//		} catch (BadRequestException e) {
//			throw new BadRequestException("Failed to save user details");
//		}
//		return new ResponseEntity<>(userDTO, HttpStatus.CREATED);
//
//	}

	@GetMapping("/getall")
	public ResponseEntity<List<UserDTO>> getAll() {
		return new ResponseEntity<List<UserDTO>>(userService.findByAllUser(), HttpStatus.OK);

	}
//	@PostMapping("/userentity")
//	public User saveUser(@RequestBody User user) {
//		return userService.saveUser(user);
//		//return new ResponseEntity<>(userService.saveUser(user), HttpStatus.OK);
//
//	}

	@PostMapping("/saveuser")
	public ResponseEntity<UserDTO> saveUserDetails(@RequestBody UserDTO userDTO)
			throws BadRequestException {
		return new ResponseEntity<>(userService.saveUserDetails(userDTO), HttpStatus.CREATED);

	}

}
