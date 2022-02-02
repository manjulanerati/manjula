package com.team.java.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
@Autowired
CustomerRepositry customerRepositry;

 public Customer createCustomer(Customer customer) {
	 
	 return customerRepositry.save(customer);
	 
 }
 public List<Customer>getCustomer() {
	 
	 return customerRepositry.findAll();
 }
 public boolean deleteAllCustomer() {
	 try {
		 customerRepository.deleteAll();
	 }
	 catch(Exception e)
	 {
		 return false;
	 }
	 return  true;
 }
 public Customer updateCustomer(int customerId,Customer obj) {
	 
	 Optional<Customer>addCustomer=customerRepositry.findById(customer Id);
	 if(addCustomer.isPresent())
	 {
		 Customer oldObj = addContainer.get();
		 oldObj.setName(obj.getName());
		 oldObj.setId (obj.getId());
		 oldObj.setPassword(obj.getPassword);
		 System.out.println("Successfully updated");
		 return customerRepositry.saveAndFlush(oldObj);
	 }
	 System.out.println("No object found witn these Id");
	 return obj;
 }
	 
