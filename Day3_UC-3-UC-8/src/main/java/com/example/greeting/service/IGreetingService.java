package com.example.greeting.service;

import java.util.List;

import com.example.greeting.dto.GreetingDTO;
import com.example.greeting.entity.GreetingEntity;

public interface IGreetingService 
{
	public abstract List<GreetingEntity> getAllDetails();
	public abstract GreetingEntity getById(int id);
	public abstract GreetingEntity addRecord(GreetingDTO dto);
	public abstract GreetingEntity updateRecord(GreetingDTO dto,int id);
	public abstract GreetingEntity deleteById(int id);
}
