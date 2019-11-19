package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepo; 
	
	@Override
	public List<Customer> getCustomers() {
		List<Customer> list=new ArrayList<>();
		customerRepo.findAll().forEach(list::add);
		return list;
	}

	@Override
	public Customer getCustomer(Long id) {
		return customerRepo.findById(id).get();
	}

	@Override
	public void addCustomer(Customer customer) {
		customerRepo.save(customer);
		
	}

	@Override
	public void updateCustomer(Long id, Customer customer) {
		Customer cust=customerRepo.findById(id).get();
		if(Optional.ofNullable(cust).isPresent()) {
			cust.setName(customer.getName());
			cust.setAddress(customer.getAddress());
			cust.setAge(customer.getAge());
			cust.setStatus(customer.isStatus());
			customerRepo.save(cust);
		}
	}

	@Override
	public void deleteCustomer(Long id) {
		customerRepo.deleteById(id);
	}

	

}
