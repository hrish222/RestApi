package com.Hoonartek;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CustomerService {
       @Autowired
	public  CustomerRepository customerRepository;
	
	
	
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
		}
	
	public List<Customer> getAllCustomer(){
		List<Customer> customer=new ArrayList<Customer>();
		customerRepository.findAll().forEach(Customer1 -> customer.add(Customer1));
		return customer;
	}
	public Customer getCustomerById(int cid) {
		return customerRepository.findById(cid).get();
	}
	public void update(Customer customer, int cid) {
		customerRepository.save(customer);
	}
	public void delete(int cid) {
		customerRepository.deleteById(cid);;
	}
	
}
