package com.cancer.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cancer.exception.ResourceNotFoundException;
import com.cancer.model.User;
import com.cancer.repository.UserRepository;

@RestController
@RequestMapping("/cancer/")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	//get user
	@GetMapping("user")
	public List<User> getAllUser(){
		return this.userRepository.findAll();
	}
	
	//get user by id
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long userId)
		throws ResourceNotFoundException {
			User user = userRepository.findById(userId)
					.orElseThrow(() -> new ResourceNotFoundException("User not found for this id: "+ userId));
		return ResponseEntity.ok().body(user);
	}
			
	//save user
	@PostMapping("user")
	public User createUser(@RequestBody User user) {
		return this.userRepository.saveAndFlush(user);
	}
	
	//update user
	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long userId,
			@Valid @RequestBody User userDetails) throws ResourceNotFoundException {
		User user = userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));

		user.setAddress(userDetails.getAddress());
		user.setDob(userDetails.getDob());
		user.setEmail(userDetails.getEmail());
		user.setFood(userDetails.getFood());
		user.setIsActive(userDetails.getIsActive());
		user.setLocation(userDetails.getLocation());
		user.setName(userDetails.getName());
		user.setPassword(userDetails.getPassword());
		user.setPhone(userDetails.getPhone());
		user.setPhoto(userDetails.getPhoto());
		user.setRecoverCode(userDetails.getRecoverCode());
		user.setRole(userDetails.getRole());
		user.setSurname(userDetails.getSurname());
		final User updatedUser= userRepository.save(user);
		return ResponseEntity.ok(updatedUser);
	}
	
	//delete user
	@DeleteMapping("/user/{id}")
	public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long userId)
			throws ResourceNotFoundException {
		User user = userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));

		userRepository.delete(user);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
