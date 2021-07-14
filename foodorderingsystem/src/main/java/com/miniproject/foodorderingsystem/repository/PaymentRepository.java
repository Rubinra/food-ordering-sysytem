package com.miniproject.foodorderingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.miniproject.foodorderingsystem.model.OrderPayment;
import com.miniproject.foodorderingsystem.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	@Query(value = "select orders.total_price as TotalPrice from orders join payment on orders.oid=payment.oid where orders.oid=:id", nativeQuery = true)
	List<OrderPayment> findByOrderDetails(Integer id);

}
