package com.ShoppingMallManagementSystem.Customer.service;

import com.ShoppingMallManagementSystem.Customer.dto.CustomerDTO;
import java.util.List;

public interface Service {
    CustomerDTO createCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> getAllCustomers();
    CustomerDTO getCustomerById(Long id);
    String deleteCustomer(Long id);
}


