package com.team.java.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.java.entity.BookingState;
import com.capg.java.entity.Customer;
import com.team.java.service.BookingStateService;
import com.team.java.service.CustomerService;
@RestController
public class CustomerController {
	@Autowired
	 CustomerService  customerService;
	@PostMapping("/customers")
	public Customer addCustomere(@RequestBody Customer customer)
	{
		return customerService.addCustomer(customer);
	}
@GetMapping("/customers")
public List<Customer> getCustomer(){
	return customerService.getCustomer();
}
@DeleteMapping("/customers")
public boolean deleteAllCustomers()
{
	return customerService.deleteAllCustomers();
	
}
@PutMapping("/customers")
public Customer updateCustomer(@PathVariable int customerId, @RequestBody Customer obj) {
	return CustomerService.updateCustomer(customerId,obj);
	
}
}




