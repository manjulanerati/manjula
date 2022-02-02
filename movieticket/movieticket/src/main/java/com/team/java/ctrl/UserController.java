package com.team.java.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.java.entity.User;
import com.team.java.service.ShowService;
import com.team.java.service.UserService;
@RestController
public class UserController {
	@Autowired
	 UserService  userService;
	@PostMapping("/users")
	public User addUser(@RequestBody User user)
	{
		return userService.addUser(user);
	}
@GetMapping("/users")
public List<User> getUser(){
	return showUser.getUser();
}
@DeleteMapping("/users")
public boolean deleteAllUsers()
{
	return userService.deleteAllUsers();
	
}
@PutMapping("/users")
public User updateUser(@PathVariable int userId, @RequestBody User obj) {
	return userService.updateUser(userId,obj);
	
}
}
