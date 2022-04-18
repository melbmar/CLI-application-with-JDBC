package com.revature.daos;

import java.util.ArrayList;
import com.revature.models.Users;


public interface UsersDAOInterface {
	
	//This method will return every user from the database 
	ArrayList<Users> getUsers();
	//This method will take add user and insert it into the database
	void addUsers(Users user);
	//This method will return every user from the database 
	ArrayList<Users> getUsersbyFirstName(String name);
	//This method will take get user.
	ArrayList<Users> getUsers(Users user);
	ArrayList<Users> displayUsers();
	

	
		
}
