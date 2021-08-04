package com.miniproject.foodorderingsystem.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.foodorderingsystem.model.OrderPayment;
import com.miniproject.foodorderingsystem.model.Payment;
import com.miniproject.foodorderingsystem.service.PaymentService;
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/payment")
@RestController
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@GetMapping("/getpayment/{id}")
	List<OrderPayment> getPayment(@PathVariable Integer id) {
		System.out.println("Inside getpayment controller");
		return paymentService.findByOrderDetails(id);
	}

	@PostMapping("/postpayment")
	Payment savePayment(@RequestBody Payment payment) {
		System.out.println("Inside payment controller");
		Payment savedPayment = paymentService.save(payment);
		return savedPayment;
	}

}
