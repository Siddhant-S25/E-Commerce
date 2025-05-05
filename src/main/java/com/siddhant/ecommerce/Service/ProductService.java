package com.siddhant.ecommerce.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siddhant.ecommerce.Product;
import com.siddhant.ecommerce.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
	
	 @Autowired
	    private ProductRepository productRepository;

	    // Get all products
	    public List<Product> getAllProducts() {
	        return productRepository.findAll();
	    }

	    // Get product by ID
	    public Optional<Product> getProductById(Long id) {
	        return productRepository.findById(id);
	    }

	    // Add new product
	    public Product createProduct(Product product) {
	        return productRepository.save(product);
	    }

	    // Update product
	    public Product updateProduct(Long id, Product updatedProduct) {
	        return productRepository.findById(id)
	                .map(product -> {
	                    product.setName(updatedProduct.getName());
	                    product.setPrice(updatedProduct.getPrice());
	                    product.setStock(updatedProduct.getStock());
	                    product.setDescription(updatedProduct.getDescription());
	                    return productRepository.save(product);
	                }).orElse(null);
	    }

	    // Delete product
	    public void deleteProduct(Long id) {
	        productRepository.deleteById(id);
	    }

}
