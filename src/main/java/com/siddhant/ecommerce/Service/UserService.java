package com.siddhant.ecommerce.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siddhant.ecommerce.User;
import com.siddhant.ecommerce.UserRepository;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

	 @Autowired
	    private UserRepository userRepository;

	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }

	    public Optional<User> getUserById(Long id) {
	        return userRepository.findById(id);
	    }

	    public User createUser(User user) {
	        return userRepository.save(user);
	    }

	    public User updateUser(Long id, User updatedUser) {
	        return userRepository.findById(id)
	                .map(user -> {
	                    user.setUsername(updatedUser.getUsername());
	                    user.setEmail(updatedUser.getEmail());
	                    user.setPassword(updatedUser.getPassword());
	                    return userRepository.save(user);
	                }).orElse(null);
	    }

	    public void deleteUser(Long id) {
	        userRepository.deleteById(id);
	    }
	}

