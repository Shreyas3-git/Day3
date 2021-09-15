package com.example.greeting.builder;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.example.greeting.dto.GreetingDTO;
import com.example.greeting.entity.GreetingEntity;

@Component
public class GreetingBuilder 
{
	public GreetingEntity addBuilder(GreetingDTO dto)
	{
		GreetingEntity entity = new GreetingEntity(dto);
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}

}
