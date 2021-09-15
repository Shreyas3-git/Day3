package com.example.greeting.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.greeting.dto.GreetingDTO;

@Entity
@Table(name="greeting_tbl")
public class GreetingEntity 
{
	@Id
	private int id;
	@GeneratedValue
	private String firstName;
	private String lastName;
	private String message;
	
	public GreetingEntity(GreetingDTO dto) {
		super();
		this.firstName = dto.getFirstName();
		this.lastName = dto.getLastName();
		this.message = dto.getMessage();
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
