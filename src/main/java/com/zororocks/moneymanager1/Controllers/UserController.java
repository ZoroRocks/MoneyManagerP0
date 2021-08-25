package com.zororocks.moneymanager1.Controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zororocks.moneymanager1.Models.User;
import com.zororocks.moneymanager1.Repositories.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	
	private UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	@GetMapping("alluser")
	Collection<User> users(){
		return userRepository.findAll();
	}
}
