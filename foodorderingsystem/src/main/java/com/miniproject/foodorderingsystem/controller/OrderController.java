package com.miniproject.foodorderingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.miniproject.foodorderingsystem.model.Order;
import com.miniproject.foodorderingsystem.model.Products;
import com.miniproject.foodorderingsystem.service.OrderService;
import com.miniproject.foodorderingsystem.service.ProductService;

@RestController
public class OrderController
{
	@Autowired
	private OrderService orderService;
	@Autowired
	private ProductService productService;
	
	
	@GetMapping("/placeorder/{id}")
	Products getOrders(@PathVariable Integer id)
	{
		System.out.println("Inside placeorder controller");
		return productService.findById(id).get();
	}
	
	@PostMapping("/order")
	Order saveOrders(@RequestBody Order order) 
	{
		System.out.println("Inside order controller");
		Order savedOrder = orderService.save(order);
		return savedOrder;
	}

	
	

}
