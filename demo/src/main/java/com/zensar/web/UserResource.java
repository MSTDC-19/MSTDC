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
		
		@GetMapping("/{id}")	
		public User getUser(@PathVariable("id") int productId) {
			return service.findById(productId);
		}
		
		/*@PostMapping
		public String createUser(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("brand") String brand,@RequestParam("price") float price) {
		User user=new User(productId,name,brand,price);
		service.create(product);
		return "Product "+productId+" created successfully.";
		}
		*/
		@PutMapping
		public String editUser(@RequestBody User user) {
			service.edit(user);
			return "User "+user.getId()+" edited successfully.";
		}
		
		@DeleteMapping
		public String removeUser(@RequestBody User user) {
			service.remove(user);
			return " User "+user.getId()+" removed successfully.";
		}
		
		@GetMapping("/count")
		public int getUserCount() {
			return service.findAllUsers().size();
		}
	}

	
	

