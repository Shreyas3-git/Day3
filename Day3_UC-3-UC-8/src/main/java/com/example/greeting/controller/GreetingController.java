package com.example.greeting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.greeting.dto.GreetingDTO;
import com.example.greeting.entity.GreetingEntity;
import com.example.greeting.service.IGreetingService;

import java.util.List;

@RestController
public class GreetingController 
{
	@Autowired
	private IGreetingService  GreetingService;
	
	@GetMapping(value = "/retrive")
	public List<GreetingEntity> getAllDetails()
	{
		return GreetingService.getAllDetails();
	}
	
	@GetMapping(value = "/retrive/{id}")
	public GreetingEntity getById(@PathVariable int id)
	{
		return GreetingService.getById(id);
	}
	
	@PostMapping(value = "/insert")
	public GreetingEntity insertRecord(@RequestBody GreetingDTO dto)
	{
		return GreetingService.addRecord(dto);
	}
	
	@PutMapping(value = "/update/{id}")
	public GreetingEntity ModifyRecord(@RequestBody GreetingDTO dto,@PathVariable int id)
	{
		return GreetingService.updateRecord(dto, id);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public GreetingEntity removeRecord(@PathVariable int id)
	{
		return GreetingService.deleteById(id);
	}
}
