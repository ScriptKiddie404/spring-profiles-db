package com.scriptkiddie404.profiles.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scriptkiddie404.profiles.models.User;
import com.scriptkiddie404.profiles.repositories.UserRepository;

@RestController
@RequestMapping("/users")
public class UsersController {

	private final UserRepository userRepository;

	@Autowired
	public UsersController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GetMapping
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
}
