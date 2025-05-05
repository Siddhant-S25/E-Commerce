package com.siddhant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.siddhant.ecommerce.Product;
import com.siddhant.ecommerce.Service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	 @Autowired
	    private ProductService productService;

	    // Get all products
	    @GetMapping
	    public List<Product> getAllProducts() {
	        return productService.getAllProducts();
	    }

	    // Get product by ID
	    @GetMapping("/{id}")
	    public Optional<Product> getProductById(@PathVariable Long id) {
	        return productService.getProductById(id);
	    }

	    // Create a new product
	    @PostMapping
	    public Product createProduct(@RequestBody Product product) {
	        return productService.createProduct(product);
	    }

	    // Update a product
	    @PutMapping("/{id}")
	    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
	        return productService.updateProduct(id, product);
	    }

	    // Delete a product
	    @DeleteMapping("/{id}")
	    public void deleteProduct(@PathVariable Long id) {
	        productService.deleteProduct(id);
	    }

}
