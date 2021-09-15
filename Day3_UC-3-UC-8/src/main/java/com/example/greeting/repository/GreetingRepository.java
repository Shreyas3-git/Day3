package com.example.greeting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.greeting.entity.GreetingEntity;

@Repository
public interface GreetingRepository extends JpaRepository<GreetingEntity,Integer> 
{

}
