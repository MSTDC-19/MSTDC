package com.zensar.web;



	import java.util.List;

	import javax.websocket.server.PathParam;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.User;
import com.zensar.services.UserService;


	@RestController
	@RequestMapping("/users")
	public class UserResource {
		@Autowired
		private UserService service;
		
		@GetMapping
		public List<User> getAllUsers() {
			return service.findAllUsers();
		}
		
		@GetMapping("/{userId}")	
		public User getUser(@PathVariable("userId") int userId) {
			return service.findById(userId);
		}
		
		@PostMapping
		public String createUser(@RequestParam("userId") int userId,@RequestParam("name") String name,@RequestParam("role") String role,@RequestParam("password") String password,@RequestParam("contact")  int contact,@RequestParam("email") String email) {
		User user=new User(userId,name,role,password,contact,email);
		service.create(user);
		return "User "+userId+" created successfully.";
		}
		
		@PutMapping
		public String editUser(@RequestBody User user) {
			service.edit(user);
			return "User "+user.getUserId()+" edited successfully.";
		}
		
		@DeleteMapping
		public String removeUser(@RequestBody User user) {
			service.remove(user);
			return " User "+user.getUserId()+" removed successfully.";
		}
		
		@GetMapping("/countUsers")
		public int getUserCount() {
			return service.findAllUsers().size();
		}
	}

	
	

