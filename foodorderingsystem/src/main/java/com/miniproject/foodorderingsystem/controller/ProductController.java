package com.miniproject.foodorderingsystem.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.foodorderingsystem.model.Products;
import com.miniproject.foodorderingsystem.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;

	@PostMapping("/addproducts")
	Products addProducts(@RequestBody Products product) {
		System.out.println("Inside addproducts controller");
		Products savedProduct = productService.save(product);
		return savedProduct;
	}

	@GetMapping("/listproducts")
	List<Products> getProducts() {
		System.out.println("Inside listproducts controller");
		return productService.findByAll();

	}

	@PutMapping("/updateproducts/{id}")
	Products updateProducts(@PathVariable Integer id, @RequestBody Products product) {
		Products updatedProduct = productService.updateProducts(product, id);
		return updatedProduct;
	}

	@DeleteMapping("/deleteproducts")
	Map<String, String> deleteProducts(@RequestParam Integer id) {
		Map<String, String> status = new HashMap<>();
		Optional<Products> product = productService.findById(id);
		if (product.isPresent()) {
			productService.delete(product.get());
			status.put("Status", "Product deleted successfully");
		} else {
			status.put("Status", "Product does not exist");
		}
		return status;
	}

}
