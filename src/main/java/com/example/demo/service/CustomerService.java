package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	public Customer getCustomer(Long id);
	public void addCustomer(Customer customer);
	public void updateCustomer(Long id,Customer customer);
	public void deleteCustomer(Long id);
}
