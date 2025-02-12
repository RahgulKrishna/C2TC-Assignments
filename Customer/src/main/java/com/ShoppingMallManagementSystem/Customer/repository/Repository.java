package com.ShoppingMallManagementSystem.Customer.repository;

	import com.ShoppingMallManagementSystem.Customer.Customer;
	import org.springframework.data.jpa.repository.JpaRepository;


	public interface Repository extends JpaRepository<Customer, Long> {
	}


