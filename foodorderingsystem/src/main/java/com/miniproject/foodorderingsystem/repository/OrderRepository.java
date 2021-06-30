package com.miniproject.foodorderingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miniproject.foodorderingsystem.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
