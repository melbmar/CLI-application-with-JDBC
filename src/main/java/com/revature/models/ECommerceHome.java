package com.revature.models;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.Launcher;
import com.revature.daos.ItemsDAO;
import com.revature.daos.ShopDAO;
import com.revature.daos.UsersDAO;

//This ECommerceHome Class will have a method that displays Customer, Shop, MyCart and User that can interact with: displayECommerceHome()
//ECommerceHome, will give give inputs that will interact with the database
public class ECommerceHome {
	
	
	//Instantiating an ShopDAO, ItemsDAO, and UserDAO objects, need to used their methods
	ShopDAO shopDAO = new ShopDAO();
	ItemsDAO itemDAO = new ItemsDAO();
    UsersDAO uDAO = new UsersDAO();
	
	 
	 //All of the content display options and control flow are contained within this method
	 public void displayECommerceHome() {
		 
		    boolean displayLogin = true; // Need to handle to display the interaction to the costumer in the application.
		    boolean displayECommerceHome = true; //Use this to handle whether the Home page will continues after customer input
			Scanner scan = new Scanner(System.in); //The Scanner allows to the object to parse (read) user input
				 			
			         
			          // It'll will have an while loop to display the home that will have all contents
			          // This loop while (true) be executed the boolean condition. 
			          while (displayECommerceHome) { 
			        	  
			        	 
			        	  System.out.println("   |                                                                 | ");
			  			  System.out.println("   ****--------------     ***********     ------------------------**** ");
			  			  System.out.println("        WECOME TO THE  ' 'CHA-CHA-CHA' '  E-COMMERCE SHOP PLATFORM    ");
			  			  System.out.println("   ****--------------     ***********     ------------------------**** ");
			  			  System.out.println("   |                                                                 | ");
			  			  System.out.println("   |                                                                 | ");
			  			  System.out.println("         -----------------------------------------------------         ");
			  			  System.out.println("   *                                                                 * ");
			        	  System.out.println("   |                                                                 | ");
			        	  System.out.println("                   ' WELCOME TO OUR E-COMMERCE SHOP '                  "); 
			        	  
			        	  
			        	  // Display the menu bar that the customer will choose their shop/log
			        	  System.out.println("   *                                                                 * ");
			        	  System.out.println("                                                                       ");
			        	  System.out.println("   *                                                                 * ");
			        	  System.out.println("     HELLO CUSTOMER ----- Please Log In or Make your Purchase  ");
			        	  System.out.println("   *                                                                 * ");
			  			
		   // Start While loop that will hold the logging.
		   // The costumer/user can login into the DB.  	        	  
		   while(displayLogin) {		
			      System.out.println("     USERNAME:");
			      String username = scan.nextLine();
			      System.out.println("     PASSWORD:");
			      String password = scan.nextLine();
			      			
			      		    //Control flow based on whether the user provided accurate login credentials
			      			if(uDAO.login(username, password)) {
			      				System.out.println("     Access Granted! Welcome! ^_^ ");
			      				displayLogin = false;
			      				break;
			      			}
			      			
			      			System.out.println("         LOGIN FAILED! TRY AGAIN. ");
			      			
			      		}
			      		
                                       // will display the menu as long the displayECommerceHome is true
		                               while(displayECommerceHome) {
		                            	    
		                            	   //This will be display the customer to choose the option shop he will want.
		                            	   System.out.println("   *                                                                 * ");
		         			        	   System.out.println("   |                                                                 | "); 
		                            	   System.out.println("                            CHOOSE AN OPTION                           ");
		                       			   System.out.println("                         ----------------------                        ");
		                       			   System.out.println("                         CONVERSE - VANZ - FILA                        ");  
		                            	   
			        	  // The application have a CLI users(Customer) and log customer can interact with the application/database
			        	  int input = scan.nextInt();
			        	  scan.nextLine();   
			        	  
			        	  
			                  // The statement will choose the all items and the customer can interact with the shop
			        	      switch(input) {
			                         case 1:{
			        	                  System.out.println("Hello Customer");
			        	                  break;
			   		                      } 
			   		                 case 2: {
			   		  				      System.out.println(" Thank you for Your Purchase. See you again ^_^");
			   		  				      displayECommerceHome = false; //remember, the while loop depends on displayMenu being true. so this ends the loop.
			 		  				      break;
			   		                      }
			   		                 case 3: {
			   		  				      //I am call my getShop() method from the Shop, will shows the shop the e-commmerce
			   		                	  ArrayList<Shop> shops = shopDAO.getShop();
			   		                	  
			   		                	  //Be println the values from the Shop variables 
			   		                	  // forEach be use to iterate the elements. Java 8
			   		                	  // -> parameters (lambda) expression allows (left-side) from the implementation (right side).
			   		                	  // The lambda notation - It is used to link arguments-list and body of expression. It will print the ArrayList from shop
			   		                	  shops.forEach ( (shop) -> { System.out.println (shop); 
			   		                	  // (getShop_id()+ " , " + getBrands_type+ " , " + getColor_name+ " , " + getSize_number);
			   		                      });
									       break;
			   		                       }
			   		                 case 4: {
			   		                	  // This ArraysList item call the method from the Items, it'll show the price, and type)
			   		                	  ArrayList<Items> items = itemDAO.getItem();
			   		                	      // The for loop will used exclusively to through elements in the ArrayList
			   		                	  for (Items item : items);
			   		                	      System.out.println (items);
			   		                 }
			   		                	  
			        	      }		   		                 
			                         
	    } //while loop ends here
	
	
	 } //method ends here


	 }

} //class ends here