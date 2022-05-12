package com.emart.serviceimpl;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.emart.dto.UserDTO;
import com.emart.exception.BadRequestException;
import com.emart.model.User;
import com.emart.repository.UserRepository;
import com.emart.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper modelMapper;

	/*
	 * @Override public User saveUser(UserDTO userDTO) { User user =
	 * modelMapper.map(userDTO, User.class); return userRepository.save(user);
	 * 
	 * }
	 */
//
//	@Override
//	public List<UserDTO> findByAllUser() {
//		List<UserDTO> userDTOs = new ArrayList<UserDTO>();
//		List<User> users = userRepository.findAll();
//		for (User user : users) {
//			UserDTO userDTO = modelMapper.map(user, UserDTO.class);
//			userDTOs.add(userDTO);
//		}
//		return userDTOs;
//	}

	@Override
	public UserDTO saveUserDetails(UserDTO userDTO) {
		User user = modelMapper.map(userDTO, User.class);
		
		user = userRepository.save(user);

		return modelMapper.map(user, UserDTO.class);
	}

	@Override
	public UserDTO findByUserId(int userId) throws BadRequestException {
 		return null;
	}

	@Override
	public List<UserDTO> findByAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public User saveUser(User user) {
//		System.out.println(user.getUserEmail());
//		return userRepository.save(user);
//	}

}
