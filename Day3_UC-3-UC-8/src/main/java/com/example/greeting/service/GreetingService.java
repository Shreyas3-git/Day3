package com.example.greeting.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.example.greeting.dto.GreetingDTO;
import com.example.greeting.entity.GreetingEntity;
import com.example.greeting.repository.GreetingRepository;

@Service
public class GreetingService implements IGreetingService
{
	@Autowired
	private GreetingRepository repository;

	@Override
	public List<GreetingEntity> getAllDetails() 
	{
		List<GreetingEntity> entity = new ArrayList<>();
		repository.findAll().forEach(entity :: add);
		return entity;
	}

	@Override
	public GreetingEntity getById(int id) 
	{
		return repository.findById(id).orElse(null);
	}

	@Override
	public GreetingEntity addRecord(GreetingDTO dto) 
	{
		GreetingEntity entity = new GreetingEntity(dto);
		repository.save(entity);
		return null;
	}

	@Override
	public GreetingEntity updateRecord(GreetingDTO dto, int id) 
	{
		GreetingEntity entity = repository.findById(id).orElse(null);
		BeanUtils.copyProperties(dto, entity);
		repository.save(entity);
		return null;
	}

	@Override
	public GreetingEntity deleteById(int id)
	{
		repository.deleteById(id);
		return null;
	}
	
}
