package com.miniproject.foodorderingsystem.service.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.foodorderingsystem.model.Products;
import com.miniproject.foodorderingsystem.repository.ProductRepository;
import com.miniproject.foodorderingsystem.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productRepository;

	public Optional<Products> findById(Integer id) {
		return productRepository.findById(id);
	}

	public List<Products> findByAll() {
		return productRepository.findAll();
	}

	public Products save(Products product) {
		return productRepository.save(product);
	}

	public Products updateProducts(Products product, Integer id) {
		product.setPid(id);
		return productRepository.save(product);
	}

	public void delete(Products product) {
		productRepository.delete(product);
	}

}
