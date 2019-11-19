package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.service.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public Customer getCustomer(@PathVariable Long id){
		return customerService.getCustomer(id);
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public void saveCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
	
	@RequestMapping(value = "/update/{id}",method = RequestMethod.PUT)
	public void updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
		customerService.updateCustomer(id, customer);
	}
	
	@RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable Long id) {
		customerService.deleteCustomer(id);
	}

}
