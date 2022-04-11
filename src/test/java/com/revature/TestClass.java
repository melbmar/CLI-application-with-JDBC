package com.revature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import javax.naming.NameNotFoundException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.revature.models.Customer;
import com.revature.models.Items;
import com.revature.models.Shop;



//This class will have the test part of the Unit Testing with JUnit
// It allows the ensures when methods are running as expected.
// It will be test the shop, customer, item class
public class TestClass {

	//Declare an Uninitialized a shop, customer, item object so we can use and test it's methods
	static Shop shop;
	static Items items;
	static Customer customer;
	
	
	       String name = "Converse";
	       String color = "Red";
	       float size = 7;
	       String name1 = "Canvas Platform Chuck Taylor All Star";
	       float price = 50.00f;
	       String email = "firssecd@mail.com";
	       String address = "New York 'fake'";
	       int customer_id = 2;
	       
    
	
	    @Before //Methods with @Before will run BEFORE every tests run in JUnit 4, it's @BeforeAll in JUnit
	    // It to initialize my Shop, Items, and customer objects and create some variables to be used in the tests
	    public void initialise() {
	    	System.out.println(" In the @Before method ");
	    	shop = new Shop();
	    	items = new Items();
	    	customer = new Customer();
	    }
	    
	    @After //methods with @After will run AFTER every test runs in JUnit 4, it's @AfterAll in Junit 5
		//It to set my shop back to null after each method runs
		public void uninitialize() {
			System.out.println(" In the @After method ");
			shop = null;
			items = null;
			customer = null;
	    }
	
                                                
	                        
	    //It will have all Unit tests 
	    // Test for Shop 
	    //Write good tests! Most entry level dev positions will have you writing tests
	    @Test
	    public void testBrads_type() {
	    	System.out.println(" CHOOSE ITEM ");
	    	String result = shop.getBrands_type();
	    	assertTrue(result == name);    
			
		}

		@Test
	    public void testColor_name() {
	    	System.out.println(" YOU CHOOSE COLOR ");
	    	String result = shop.getColor_name();
	    	assertTrue(result == color);
	    }
	    
	    @Test
	    public void testSize_number() {
	    	System.out.println(" CHOOSE ANOTHER SIZE ");
	    	float result = shop.getSize_number();
	    	assertTrue(result == size);
	    }
	    	   
	    //Test for Item
	    @Test
	    public void testBrands_name() {
	    	System.out.println(" YOUR BRAND IS CONVERSE");
	    	String result = items.getBrands_name();
	    	assertTrue(result == name1);
	    	
	    }
	    @Test
	    public void testPrice() {
	    	System.out.println(" YOUR BRAND PRICE");
	    	float result = items.getPrice();
	    	assertTrue(result == price);
	    	
	    }
	    
	     //Test for Customer
	    @Test(expected = NameNotFoundException.class)
	    public void testFirst_name() throws NameNotFoundException {
	    	System.out.println(" YOUR NAME ");
	    }
	    
	    @Test(expected = NameNotFoundException.class)
	    public void testSecond_name() throws NameNotFoundException {
	    	System.out.println(" YOUR NAME ");

	    }
	    
	    @Test
	    public void testEmail() {
	    	System.out.println(" YOUR EMAIL ");
	    	String result = customer.getEmail();
	    	assertTrue(result == email );
	    	
	    }
	    
	    @Test
	    public void testAdress() {
	    	System.out.println(" YOUR ADDRESS ");
	    	String result = customer.getAddress();    	
	    	assertEquals(address, result);
	    	
	    }
	    
	    @Test
	    public void testCustomer_id() {
	    	System.out.println(" IDENTIFICATION ");
	    	int result = customer.getCustomer_id();    	
	    	assertEquals(customer_id, result);
	    }
	
	    
} //class ends here
