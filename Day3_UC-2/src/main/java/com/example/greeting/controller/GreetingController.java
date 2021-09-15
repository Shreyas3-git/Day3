package com.example.greeting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.greeting.dto.GreetingDTO;
import com.example.greeting.service.GreetingService;

@RestController
public class GreetingController 
{
	@Autowired
	private GreetingService greetingService;
	
	@GetMapping(value = "/retrive/{id}/{fname}/{lname}")
	public String getAllDetails(@PathVariable int id,@PathVariable String fname,@PathVariable String lname)
	{
		return greetingService.helloMessage(lname,fname,id);
	}
	
}
