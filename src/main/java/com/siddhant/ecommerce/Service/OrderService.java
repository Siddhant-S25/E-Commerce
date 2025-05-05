package com.siddhant.ecommerce.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siddhant.ecommerce.Order;
import com.siddhant.ecommerce.OrderRepository;

import java.util.List;
import java.util.Optional;

@Service

public class OrderService {

	   @Autowired
	    private OrderRepository orderRepository;

	    // Get all orders
	    public List<Order> getAllOrders() {
	        return orderRepository.findAll();
	    }

	    // Get order by ID
	    public Optional<Order> getOrderById(Long id) {
	        return orderRepository.findById(id);
	    }

	    // Create new order
	    public Order createOrder(Order order) {
	        return orderRepository.save(order);
	    }

	    // Delete order
	    public void deleteOrder(Long id) {
	        orderRepository.deleteById(id);
	    }
}
