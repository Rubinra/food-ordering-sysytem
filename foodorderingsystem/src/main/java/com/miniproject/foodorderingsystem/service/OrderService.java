package com.miniproject.foodorderingsystem.service;

import java.util.List;
import java.util.Optional;

import com.miniproject.foodorderingsystem.model.Order;
import com.miniproject.foodorderingsystem.model.ProductsOrders;

public interface OrderService {

	Optional<Order> findById(Integer id);

	List<ProductsOrders> findByDetails(Integer id);

	Order save(Order order);

	void delete(Order order);

}
