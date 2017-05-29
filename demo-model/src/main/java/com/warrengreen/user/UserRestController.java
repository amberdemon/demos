package com.warrengreen.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserRestController {
	
	@Autowired
	private UserRepo userRepo;

	@RequestMapping(method = RequestMethod.POST)
	public User save(@RequestBody User user){
		return userRepo.save(user);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<User> list(){
		return userRepo.findAll();
	}
}
