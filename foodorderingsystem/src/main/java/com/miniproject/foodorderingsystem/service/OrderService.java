package com.miniproject.foodorderingsystem.service;

import java.util.Optional;

import com.miniproject.foodorderingsystem.model.Order;


public interface OrderService 
{
	Optional<Order> findById(Integer id);
	
	Order save(Order order);
	
	

}
