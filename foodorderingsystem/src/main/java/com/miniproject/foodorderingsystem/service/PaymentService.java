package com.miniproject.foodorderingsystem.service;

import java.util.List;

import com.miniproject.foodorderingsystem.model.OrderPayment;
import com.miniproject.foodorderingsystem.model.Payment;

public interface PaymentService {
	Payment save(Payment payment);

	List<OrderPayment> findByOrderDetails(Integer id);

}
