package com.miniproject.foodorderingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.miniproject.foodorderingsystem.model.Order;
import com.miniproject.foodorderingsystem.model.ProductsOrders;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

	@Query(value = "select  products.pid as Pid,products.price as Price,products.product_name as Productname from products join orders on orders.pid=products.pid where orders.pid=:id", nativeQuery = true)
	List<ProductsOrders> findByDetails(Integer id);

}
