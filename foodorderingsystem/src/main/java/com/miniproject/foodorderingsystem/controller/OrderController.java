package com.miniproject.foodorderingsystem.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.foodorderingsystem.model.Order;
import com.miniproject.foodorderingsystem.model.ProductsOrders;
import com.miniproject.foodorderingsystem.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;

	@GetMapping("/placeorder/{id}")
	List<ProductsOrders> getOrders(@PathVariable Integer id) {
		System.out.println("Inside placeorder controller");
		return orderService.findByDetails(id);

	}

	@PostMapping("/order")
	Order saveOrders(@RequestBody Order order) {
		System.out.println("Inside order controller");
		Order savedOrder = orderService.save(order);
		return savedOrder;
	}

	@DeleteMapping("/deleteorder")
	Map<String, String> deleteOrder(@RequestParam Integer id) {
		Map<String, String> status = new HashMap<>();
		Optional<Order> order = orderService.findById(id);
		if (order.isPresent()) {
			orderService.delete(order.get());
			status.put("Status", "Order deleted successfully");
		} else {
			status.put("Status", "Order does not exist");
		}
		return status;
	}

}
