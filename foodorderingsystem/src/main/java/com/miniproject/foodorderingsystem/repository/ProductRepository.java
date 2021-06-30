package com.miniproject.foodorderingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miniproject.foodorderingsystem.model.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {

}
