package com.revature.models;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.daos.CustomerDAO;
//import com.revature.Launcher;
import com.revature.daos.ShopDAO;
import com.revature.daos.UsersDAO;

//This ECommerceHome Class will have a method that displays Customer, Shop, MyCart and User that can interact with: displayECommerceHome()
//ECommerceHome, will give give inputs that will interact with the database
public class ECommerceHome {
	
	
	//Instantiating an ShopDAO, ItemsDAO, and UserDAO objects, need to used their methods
	 UsersDAO uDAO = new UsersDAO();
	 ShopDAO shopDAO = new ShopDAO();
	 CustomerDAO cusDAO = new CustomerDAO();

    
	
	 
	 //All of the content display options and control flow are contained within this method
	public void displayECommerceHome() {
		 
		    boolean displayLogin = true; // Need to handle to display the interaction to the costumer in the application.
		    boolean displayECommerceHome = true; //Use this to handle whether the Home page will continues after customer input
		    boolean displayEnd= false; // Need to handle to display the end to the application.
		    
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
			        	  System.out.println("     HELLO USERS ----- Please log in and Enjoy the App  ");
			        	  System.out.println("   *                                                                 * ");
			  			
		   // Start While loop that will hold the logging.
		   // The costumer/user can login into the DB.  
		   // Display the login prompt, and not let the user access the rest of the application until they log in	        	  
			while(displayLogin) {
			      			
			System.out.println("USERNAME:");
			      			
			 String username = scan.nextLine();
			      			
			 System.out.println("PASSWORD:");
			      			
			 String password = scan.nextLine();
			      			
			 //control flow based on whether the user provided accurate login credentials
			      	if(uDAO.login(username, password)) {
			      		System.out.println("    Login Successful! Welcome. ^_^");
			      		displayLogin = false;
			      		break;
			      			}
			      			
			      	System.out.println("LOGIN FAILED! TRY AGAIN.");
			      			
			      		}

                                       // will display the menu as long the displayECommerceHome is true
		                               while(displayECommerceHome) {
		                            	    
		                            	   //This will be display the customer to choose the option shop he will want.
		                            	   System.out.println("   *                                                                 * ");
		         			        	   System.out.println("   |                                                                 | "); 
		                            	   System.out.println("                            CHOOSE AN OPTION                           ");
		                       			   System.out.println("                         ----------------------                        ");
		                       			   System.out.println("   *                                                                 * ");
		                       			   
		                       			   
		                       			   System.out.println("     1: Add New User                         ");
		                       			   System.out.println("     2: Check Your User/Password             ");
		                       			   System.out.println("     3: Show shop by ID                      ");
		                       			   System.out.println("     4: Show customer by Shop                "); 
		                       			   System.out.println("     5: Add new Customer                     ");
		                       			   System.out.println("     6: Update new shop                      ");
		                       			   System.out.println("     7: Remove new shop                      ");
		                       			   System.out.println("     8: EXIT                                 ");
		                              
		                     // The application have a CLI users(Customer) and log customer can interact with the application/database
		                     int input = scan.nextInt();
		                     scan.nextLine(); //without nextLine(), the application won't move to the next line... so we need it!            
		                          switch(input) {
		         			
		         			            case 1: {
		         			             // The statement will choose the all items and the customer can interact with the shop
		      			        	      switch(input) {
		      			                         case 1:{
		      			                        	 
		      			               				  System.out.println("     Hello! New User, Please Enter Your First Name  ^_^ ");
		      			               				  String fName = scan.nextLine();
		      			               				  
		      			               				  System.out.println(      "Please Enter Your Second Name");
		      			               				  String lName = scan.nextLine();
		      			               				  
		      			               				  System.out.println(      "Username");
		      			               				  String uName = scan.nextLine();
		      			               				  
		      			               				  System.out.println(      "Userpassword");
		      			               				  String pName = scan.nextLine();	 
		      			               				  
		      			               				  
		      			               				         // Instantiating an ArryList to add into the user table the new input
		      			               				         Users users = new Users(fName, lName, uName, pName);
		      			               				         uDAO.addUsers(users);
		      			               			             
  
		      			        	                  break;
		      			                         }
		      			        	                case 2:{
		      			        	                    //Call the getUsers() method from the EmployeeDAO, put the results into a variable
		      			        	                	ArrayList<Users> use = uDAO.displayUsers();
		      			        	                        use.forEach(users -> {
		      			        	                    	System.out.println("   *                                                                 * ");
		      			        	                    	System.out.println("    Username: " + users.getUsername());
		      			        	                    	System.out.println("    Userpassword: " + users.getUserpassword());
		      			        	                    	System.out.println("   *                                                                * ");
		      			        	                    });
		      			        	                
		      			        	                   break;}
		      			        	                
		         			                                    
		      			        	                case 3:{
		      			        	                	System.out.println("    What shop ID whould you like to check?");
		      			        	                	int idInput = scan.nextInt();
		      			        	                	scan.nextLine();
		      			        	                	
		      			        	                	//Creating shop object.
		      			        	                	Shop shop = shopDAO.getShopById(idInput);
		      			        	                	     System.out.println(shop);
	        	                                              }
		      			        	                     }
		      			        	                break;
		      			        	                     }
		      			        	                	   case 4:{
		      			        	                		//prompt the user to enter a shop to search for
		      			        	         				System.out.println("    Which shop would you like to search for?");
		      			        	         				System.out.println("     1. Converse 2. Vanz 3. Fila");
		      			        	         				
		      			        	         			    //taking the user input
		      			        	      				    String shopInput = scan.nextLine();
		      			        	      				    //ArrayList, fill it with the results of the DAO method that gets employees by role shop
		      			        	      				    ArrayList<Customer> customerList = cusDAO.getCustomerByshop(shopInput);
		   		                   	
		   		                   				            //"for every Customer that we'll call "e" in the employeeList", do something
		   		                   					       for (Customer cu : customerList) {
		   		                   					        	System.out.println("   *                                                                 * ");
		   		                   						        System.out.println(cu.getCustomer_id());
		   		                   						        System.out.println(cu.getFirst_name());
		   		                   						        System.out.println(cu.getSecond_name());
		   		                   						        System.out.println(cu.getEmail());
		   		                   						        System.out.println(cu.getAddress());
		   		                   						        System.out.println(cu.getBrands_name());
		   		                   						        System.out.println("   *                                                                 * ");
		   		                   					       }
		   		         	                          break;
		   		                   				       
		      			        	                	   }
		   		         	                          case 5: { 
		   		         	                
		   		         	                        	System.out.println("    Enter Customer First Name");
		   		         	        				    String fName = scan.nextLine();
		   		         	                        	 
		   		         	        				    System.out.println("    Enter Customer Second Name");
		   		         	    				        String sName = scan.nextLine();
		   		         	    				        
		   		         	    				        System.out.println("    Enter your Email");
	   		         	    				            String eName = scan.nextLine();
	   		         	    				        
	   		         	    				            System.out.println("    Enter your Address");
	   		         	    				            String aName = scan.nextLine();
	   		         	    				        
		   		         	    				        
		   		         	    				        int shopId = scan.nextInt();
		   		         	    				            Customer cusm = new Customer(shopId, fName, sName, eName, aName);
		   		         	    				            cusDAO.addCustomer(cusm);
		   		         	 	                        break;
		                                                     }
		         			            
		   		         	                          case 6: {
		   		         	                        	    System.out.println("    Which shop would you like to change?");
		   		         	                        	    String brands_typeInput = scan.nextLine();
		   		         	                        	    
		   		         	                        	    System.out.println("    What is the new type?");
		   		         	                        	    
		   		         	                        	    int size_numberInput = scan.nextInt();
		   		         	        				        scan.nextLine();
		   		         	        				        
		   		         	        				        shopDAO.updateShopBrandsName(brands_typeInput, size_numberInput);
		   		         	                                }
		   		         	                        	break;
		   		         	                        		
		   		         	                         case 7: {
		   		         	                        	     System.out.println("    Enter the ID of the shop you want to delete"); 
		   		         	                        	     int idInput = scan.nextInt();
		   		         	         				
		   		         	         				         shopDAO.deleteShop(idInput);
		   		         	                                }
		   		         	                          break;
		   		         	                          
		   		         	                         case 8:{
		   		         	                              System.out.println("    Bye Bye user! Come again soon.");
		   		         	                        	      displayECommerceHome = false;
		   		         	                        	      
                                                              }
		   		         	                            break;

		      			    			default: {
		      			    				//this default block will run if the user inputs a number that isn't one of the options
		      			    				System.out.println("What did you say?? Try again. Do better...");
		      			    				
		      			    				break;
		      			    			}
		      			    		
		      			        	    	  
		      			        	                	  
		                          } 
		         			            
		      			        	      
		      			        	     
		        } //while loop ends here
		                           	
		                           	
		 } //while loop ends here
			     			          
	 } // method ends here

} //class ends here