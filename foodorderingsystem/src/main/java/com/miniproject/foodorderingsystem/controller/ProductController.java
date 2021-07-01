package com.miniproject.foodorderingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.foodorderingsystem.model.Products;
import com.miniproject.foodorderingsystem.service.ProductService;

@RestController
public class ProductController 
{
	@Autowired
	private ProductService productService;

	@PostMapping("/addproducts")
	Products addProducts(@RequestBody Products product) 
	{
		System.out.println("Inside addproducts controller");
		Products savedProduct = productService.save(product);
		return savedProduct;
	}

	@GetMapping("/listproducts")
	List<Products> getProducts()
	{
		System.out.println("Inside listproducts controller");
		return productService.findByAll();
		
	}

}
