package com.revature.models;

public class Customer {
	
	
	//All variables for the Shop class - must match the Shop table in the database
	//All variables are  private because private coupled with getters and setters (ENCAPSULATION)
	private int customer_id;
	private String first_name;
	private String second_name;
	private String email;
	private String address;
	
	
	      //Every Customer in this application will have a Shop and Items associated with it
	    private Shop shop;
		private String brands_name;

	      
	         
	               //no args constructor
	               public Customer() {
				             super();
				             // TODO Auto-generated constructor stub
			                         }
	               // args constructor
				   public Customer(int customer_id, String first_name, String second_name, String email, String address) {
					super();
					this.customer_id = customer_id;
					this.first_name = first_name;
					this.second_name = second_name;
					this.email = email;
					this.address = address;
		
				}
				// I created getter/Setter (ENCAPSULATION) one of the pillar of OOP-Java
	             // Both allows me to access and change variable to private
				
				public int getCustomer_id() {
					return customer_id;
				}
				public void setCustomer_id(int customer_id) {
					this.customer_id = customer_id;
				}
				public String getFirst_name() {
					return first_name;
				}
				public void setFirst_name(String first_name) {
					this.first_name = first_name;
				}
				public String getSecond_name() {
					return second_name;
				}
				public void setSecond_name(String second_name) {
					this.second_name = second_name;
				}
				public String getEmail() {
					return email;
				}
				public void setEmail(String email) {
					this.email = email;
				}
				public String getAddress() {
					return address;
				}
				public void setAddress(String address) {
					this.address = address;
				}
				public String getBrands_name() {
					return brands_name;
				}
				public void setBrands_name(String brands_name) {
					this.brands_name = brands_name;
				}
			
				public void setBrands_name(Shop shop) {
					this.shop = shop;
					
				}
				

} //class ends here
