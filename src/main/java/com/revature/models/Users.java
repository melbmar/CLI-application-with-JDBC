package com.revature.models;

public class Users {
	
	//All variables for the Shop class - must match the Shop table in the database
	//All variables are  private because private coupled with getters and setters (ENCAPSULATION)
	private String first_name;
    private String second_name;
    private String username;
    private String userpassword;

    
   

				//no args constructor
                  public Users() {
                	  super(); }

                // Make constructor with args	  
				public Users(String first_name, String second_name, String username, String userpassword) {
					this.first_name = first_name;
					this.second_name = second_name;
					this.username = username;
					this.userpassword = userpassword;
				}

				
				// I created getter/Setter (ENCAPSULATION) one of the pillar of OOP-Java
                // Both allows me to access and change variable to private
			
							

				public String getFirst_name() {
					// TODO Auto-generated method stub
					return null;
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


}
