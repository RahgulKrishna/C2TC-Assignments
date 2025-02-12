package com.ShoppingMallManagementSystem.Customer.service;

import com.ShoppingMallManagementSystem.Customer.dto.CustomerDTO;
import com.ShoppingMallManagementSystem.Customer.mapper.Mapper;
import com.ShoppingMallManagementSystem.Customer.Customer;
import com.ShoppingMallManagementSystem.Customer.repository.Repository;
import com.ShoppingMallManagementSystem.Customer.exception.CustomerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements Service {

    private final Repository customerRepository;

    @Autowired
    public CustomerServiceImpl(Repository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        Customer customer = Mapper.toEntity(customerDTO);
        customer = customerRepository.save(customer);
        return Mapper.toDTO(customer);
    }

    public List<CustomerDTO> getAllCustomers() {
        return customerRepository.findAll().stream()
                .map(Mapper::toDTO)
                .collect(Collectors.toList());
    }

    public CustomerDTO getCustomerById(Long id) {
        return customerRepository.findById(id)
                .map(Mapper::toDTO)
                .orElseThrow(() -> new CustomerNotFoundException("Customer not found"));
    }

    public String deleteCustomer(Long id) {
        if (customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
            return "Customer deleted successfully";
        }
        throw new CustomerNotFoundException("Customer not found");
    }

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String value() {
		// TODO Auto-generated method stub
		return null;
	}
}


