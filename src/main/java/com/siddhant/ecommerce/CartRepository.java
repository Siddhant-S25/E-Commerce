package com.siddhant.ecommerce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{

	Iterable<? extends Cart> findByUser(User u);

}
