package com.siddhant.ecommerce;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false, unique = true)
	    private String username;

	    @Column(nullable = false)
	    private String password;

	    @Column(nullable = false)
	    private String email;

	    @Column(nullable = false)
	    private String role; // CUSTOMER, ADMIN

		public Object getUsername() {
			// TODO Auto-generated method stub
			return null;
		}

		public void setUsername(Object username2) {
			// TODO Auto-generated method stub
			
		}

		public Object getEmail() {
			// TODO Auto-generated method stub
			return null;
		}

		public void setEmail(Object email2) {
			// TODO Auto-generated method stub
			
		}

		public Object getPassword() {
			// TODO Auto-generated method stub
			return null;
		}

		public void setPassword(Object password2) {
			// TODO Auto-generated method stub
			
		}

}
