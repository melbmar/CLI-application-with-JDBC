package com.revature.daos;

import java.util.ArrayList;

import com.revature.models.Customer;
import com.revature.models.Items;
import com.revature.models.Shop;




//DAO stands for Data Access Object - it's the layer of classes that directly interact with our database
public class CustomerDAO implements CustomerDAOInterface {
	
	// The ArrayList of shop objects that, which will act from the database
		ArrayList<Customer> customerList = new ArrayList<>();
		
		//Instantiate some Shop and Items Objects to use in our Shop and Items objects
		//Instantiate some type Objects that the costumer will see
		//Shop
		Shop shopcon = new Shop (1, " Converse ", " White ", 7);
		Shop shopvan = new Shop (2, " Vans ", "Black", 6);
		Shop shopfil = new Shop (3, " Fila ", " Pink ", 8);
		
		// Items
		Items itemcon = new Items (1, " Canvas Platform Chuck Taylor All Star ", (float) 50.00);
		Items itemvan = new Items (2, " Era™ Core Classics ", (float) 45.00);
		Items itemfil = new Items (3, " Women's Disruptor 2 Wedge ", (float) 101.00);
		
		             
		            //This TEMPORARY method will return the Customer from the database
		            //This method body will actually be communicating directly to the database
		            public ArrayList <Customer> getCustomer(){
		            	customerList.add(new Customer(1, "First Name", "Second Name", "firssecd@mail.com", "New York, New York", shopcon, itemcon));
		            	customerList.add(new Customer(2,"First Name", "Second Name", "firssecd@mail.com", "New York, New York", shopvan, itemvan));
		            	customerList.add(new Customer(3, "First Name", "Second Name", "firssecd@mail.com", "New York, New York", shopfil, itemfil));
		            
		            	    return customerList;
		            }

		            
		            
		           // Override those methods
					@Override
					public Customer getCustomerByID(int id) {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public void addCustomer(Customer customer) {
						// TODO Auto-generated method stub
						
					}
                    



					
		            
		   
		
	
		
			

}
