package com.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.emart.dto.UserDTO;
import com.emart.model.User;
 
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	//User save(UserDTO userDTO);
	
	//public User save(User user);


	public User findById(long userId);
}
