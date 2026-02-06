package com.nikhitha.digitalstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nikhitha.digitalstore.model.Product;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {
	private List<Product> products = new ArrayList<>();
	
	//Add new product
	@PostMapping
	public ResponseEntity<String> addProduct(@Valid @RequestBody Product product) {
		products.add(product);
		return ResponseEntity.ok("Product added successfully");
	}
	
	// Get product by ID
	@GetMapping("/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable Long id) {
		for(Product product : products) {
			if(product.getId().equals(id)) {
				return ResponseEntity.ok(product);
			}
		}
		return ResponseEntity.notFound().build();
	}
}