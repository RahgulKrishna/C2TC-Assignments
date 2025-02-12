package com.ShoppingMallManagementSystem.Customer.mapper;

	import com.ShoppingMallManagementSystem.Customer.dto.CustomerDTO;
	import com.ShoppingMallManagementSystem.Customer.Customer;

	public class Mapper {

	    public static Customer toEntity(CustomerDTO customerDTO) {
	        return new Customer(
	            customerDTO.getName(),
	            customerDTO.getEmail(),
	            customerDTO.getPhone(),
	            customerDTO.getAddress()
	        );
	    }

	    public static CustomerDTO toDTO(Customer customer) {
	        return new CustomerDTO(
	            customer.getName(),
	            customer.getEmail(),
	            customer.getPhone(),
	            customer.getAddress()
	        );
	    }
	}

	

