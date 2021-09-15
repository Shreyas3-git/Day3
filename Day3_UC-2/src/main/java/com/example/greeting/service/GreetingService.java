package com.example.greeting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.greeting.dto.GreetingDTO;
import com.example.greeting.entity.GreetingEntity;

@Service
public class GreetingService 
{
	
	public String helloMessage(String fname,String lname,int id)
	{
		GreetingDTO dto = new GreetingDTO(id,lname,fname);
		GreetingEntity entity = new GreetingEntity(dto);
		return "Hello from " + dto.getFirstName() + dto.getLastName();
	}
	
}
