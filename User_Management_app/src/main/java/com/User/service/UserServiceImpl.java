package com.User.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.model.UserDetails;
import com.User.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails createUser(UserDetails user) {
		
		return userRepo.save(user);
	}

	
}
