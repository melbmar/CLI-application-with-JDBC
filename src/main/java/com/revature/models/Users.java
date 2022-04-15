package com.revature.models;

public class Users {
	
	//All variables for the Shop class - must match the Shop table in the database
	//All variables are  private because private coupled with getters and setters (ENCAPSULATION)
    String firts_name;
    String second_name;
    String username;
    String userpassword;
    
    
                  //no args constructor
                  public Users() {
	       
                	  super(); }

                // Make constructor with args	  
				public Users(String firts_name, String second_name, String username, String userpassword) {
					super();
					this.firts_name = firts_name;
					this.second_name = second_name;
					this.username = username;
					this.userpassword = userpassword;
				}

				public String getFirts_name() {
					return firts_name;
				}

				public void setFirts_name(String firts_name) {
					this.firts_name = firts_name;
				}

				public String getSecond_name() {
					return second_name;
				}

				public void setSecond_name(String second_name) {
					this.second_name = second_name;
				}

				public String getUsername() {
					return username;
				}

				public void setUsername(String username) {
					this.username = username;
				}

				public String getUserpassword() {
					return userpassword;
				}

				public void setUserpassword(String userpassword) {
					this.userpassword = userpassword;
				}
          
				// I created getter/Setter (ENCAPSULATION) one of the pillar of OOP-Java
                // Both allows me to access and change variable to private
				
}
