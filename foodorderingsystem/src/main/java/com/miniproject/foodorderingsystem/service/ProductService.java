package com.miniproject.foodorderingsystem.service;

import java.util.List;
import java.util.Optional;
import com.miniproject.foodorderingsystem.model.Products;

public interface ProductService {

	Optional<Products> findById(Integer id);

	Products save(Products product);

	List<Products> findByAll();

	Products updateProducts(Products product, Integer id);

	void delete(Products products);
}
