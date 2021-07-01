package com.miniproject.foodorderingsystem.service.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.foodorderingsystem.model.Order;
import com.miniproject.foodorderingsystem.repository.OrderRepository;
import com.miniproject.foodorderingsystem.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService
{
	@Autowired
	OrderRepository orderRepository;

	public Optional<Order> findById(Integer id) {
		return orderRepository.findById(id);
	}

	public List<Order> findByAll() {
		return orderRepository.findAll();
	}

	public Order save(Order order) {
		return orderRepository.save(order);
	}


	public Order updateOrder(Order order, Integer id) {
		order.setBill(id);
		return orderRepository.save(order);
	}

	public void delete(Order order) {
		orderRepository.delete(order);
	}

}
