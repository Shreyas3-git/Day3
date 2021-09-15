package com.example.greeting.entity;

import com.example.greeting.dto.GreetingDTO;


public class GreetingEntity 
{
	private int id;
	private String firstName;
	private String lastName;
	
	public GreetingEntity(GreetingDTO dto) {
		super();
		this.id = dto.getId();
		this.firstName = dto.getFirstName();
		this.lastName = dto.getLastName();
	}
	
	public GreetingEntity()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
