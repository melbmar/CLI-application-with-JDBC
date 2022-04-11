package com.revature.daos;


import java.util.ArrayList;
import com.revature.models.Customer;


public interface CustomerDAOInterface {
	
	//This method will return every shop(items) from the database 
	ArrayList<Customer> getCustomer();
	//This method will return an Customer which we'll get by their id
	Customer getCustomerByID (int id);
	//This method will take add customer, and insert it into the database
	void addCustomer(Customer customer);
	

}
