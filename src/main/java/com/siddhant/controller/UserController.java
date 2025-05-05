package com.siddhant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.siddhant.ecommerce.User;
import com.siddhant.ecommerce.Service.UserService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/users")
public class UserController {
	
	   @Autowired
	    private UserService userService;

	    // Get all users
	    @GetMapping
	    public List<User> getAllUsers() {
	        return userService.getAllUsers();
	    }

	    // Get user by ID
	    @GetMapping("/{id}")
	    public Optional<User> getUserById(@PathVariable Long id) {
	        return userService.getUserById(id);
	    }

	    // Create a new user
	    @PostMapping
	    public User createUser(@RequestBody User user) {
	        return userService.createUser(user);
	    }

	    // Update a user
	    @PutMapping("/{id}")
	    public User updateUser(@PathVariable Long id, @RequestBody User user) {
	        return userService.updateUser(id, user);
	    }

	    // Delete a user
	    @DeleteMapping("/{id}")
	    public void deleteUser(@PathVariable Long id) {
	        userService.deleteUser(id);
	    }

}
