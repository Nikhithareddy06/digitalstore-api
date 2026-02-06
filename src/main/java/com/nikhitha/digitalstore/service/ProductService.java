package com.nikhitha.digitalstore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.nikhitha.digitalstore.model.Product;

@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();
    
    // add product
    public Product addProduct(Product product) {
    	productList.add(product);
		return product;
    }
    
    // get product by id
    public Product getProductById(Long id) {
    	for(Product p : productList) {
    		if(p.getId().equals(id)) {
    			return p;
    		}
    	}
    	return null;
    }    
}