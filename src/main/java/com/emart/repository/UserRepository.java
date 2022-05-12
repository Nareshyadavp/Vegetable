package com.emart.repository;
 
import org.springframework.data.repository.CrudRepository;

import com.emart.dto.UserDTO;
import com.emart.model.User;
 
 
public interface UserRepository extends CrudRepository<User, Integer> {

	  User save(UserDTO userDTO);
	
	//public User save(User user);


	  User findByUserId(int userId);
}
