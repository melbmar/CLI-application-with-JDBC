package com.revature;

import java.sql.Connection;
import java.sql.SQLException;

//It will have all import class from the ECommerceHome Platform
import com.revature.models.ECommerceHome;
import com.revature.utils.ConnectionUtil;

public class Launcher {

	public static void main(String[] args) {
		
		/*
		  
		  This is a placeholder
		  
		 Take this dog a companion to help you on your way
		 
		 	  __    __
			o-''))_____\\
			"--__/ * * * )
			c_c__/-c____/
		  
		  
		  Have fun :) I like your design.
		  
		 */
		
		
		        //In this try/catch, we're just testing whether our Connection (from the ConnectionUtil Class) is successful
				//The getConnection() method will return a Connection Object if you connect successfully
				try(Connection conn = ConnectionUtil.getConnection()){
					System.out.println("       CONNECTION SUCCESSFUL ^_-        ");
				} catch (SQLException e) { //if creating this connection fails... catch the exception and print the stack trace
					System.out.println("Connection failed... :(");
					e.printStackTrace();
				}
				
		// The main method will only have code 
		// Instantiate the EcommerceHome object
		ECommerceHome home = new ECommerceHome();
		
		
		          // Call the EcommerceHome method to display the Home from the Platform
		          home.displayECommerceHome();	
	
	}
	
}
	
