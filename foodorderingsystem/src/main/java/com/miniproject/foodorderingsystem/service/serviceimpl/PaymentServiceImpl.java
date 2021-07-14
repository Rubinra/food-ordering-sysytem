package com.miniproject.foodorderingsystem.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.foodorderingsystem.model.OrderPayment;
import com.miniproject.foodorderingsystem.model.Payment;
import com.miniproject.foodorderingsystem.repository.PaymentRepository;
import com.miniproject.foodorderingsystem.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	PaymentRepository paymentRepository;

	public Payment save(Payment payment) {
		return paymentRepository.save(payment);
	}

	public List<OrderPayment> findByOrderDetails(Integer id) {
		return paymentRepository.findByOrderDetails(id);
	}

}
