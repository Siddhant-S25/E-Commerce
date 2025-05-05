package com.siddhant.ecommerce.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siddhant.ecommerce.Cart;
import com.siddhant.ecommerce.CartRepository;
import com.siddhant.ecommerce.Product;
import com.siddhant.ecommerce.ProductRepository;
import com.siddhant.ecommerce.User;
import com.siddhant.ecommerce.UserRepository;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    // Get cart items for a user
    public List<Cart> getCartByUser(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        return (List<Cart>) user.map(cartRepository::findByUser).orElse(null);
    }

    // Add product to cart
    public Cart addToCart(Long userId, Long productId, int quantity) {
        Optional<User> user = userRepository.findById(userId);
        Optional<Product> product = productRepository.findById(productId);

        if (user.isPresent() && product.isPresent()) {
            Cart cartItem = new Cart();
            cartItem.setUser(user.get());
            cartItem.setProduct(product.get());
            cartItem.setQuantity(quantity);
            return cartRepository.save(cartItem);
        }
        return null;
    }

    // Remove item from cart
    public void removeFromCart(Long cartId) {
        cartRepository.deleteById(cartId);
    }

    // Clear cart for a user
    public void clearCart(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        user.ifPresent(u -> cartRepository.deleteAll(cartRepository.findByUser(u)));
    }
}