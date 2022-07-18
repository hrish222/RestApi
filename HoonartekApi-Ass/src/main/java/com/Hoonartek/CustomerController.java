package com.Hoonartek;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
     @Autowired
	public CustomerService customerService;
   // CustomerRepository customerRepository;
	@PostMapping("/customers")
	public int saveCustomer(@RequestBody Customer customer) {
		 customerService.addCustomer(customer);
		 return customer.getCid();
	}
	@GetMapping("/customer")
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
	}
	@GetMapping("/customer/{cid}")
	public Customer getCustomer(@PathVariable("cid") int cid) {
		return customerService.getCustomerById(cid);
	}
	@PutMapping("/customerUpdate")
	public Customer update(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		return customer;
		
	}
	@DeleteMapping("/customer/{cid}")
	public String deleteCustomer(@PathVariable("cid")int cid) {
		customerService.delete(cid);
		return "Recored Deleted";
	}
}
