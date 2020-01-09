package com.upen.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upen.db.model.User;
import com.upen.db.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class userController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/all")
	public List<User> getAllUsers() {
		
		return userRepo.findAll();
	}

	@GetMapping("/find/{name}")
	public User findByName(@PathVariable String name) {
		
		return userRepo.findByName(name);
	}

	@PostMapping(value="/add")
	public List<User> addUser(@RequestBody User user) {
		
		userRepo.save(user);
		return getAllUsers();
	}
	

	@DeleteMapping(value="/delete/{name}")
	public String deleteUser(@PathVariable String name) {
		
		User user = findByName(name);
		if (user != null) {
			userRepo.delete(user);
			return "Deleted user " + name + " Successfully!";
		} 
		return "Could NOT delete, User : " + name + " not found." ;
	}

	

}
