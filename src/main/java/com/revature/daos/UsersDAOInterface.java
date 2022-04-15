package com.revature.daos;

import java.util.ArrayList;
import com.revature.models.Users;


public interface UsersDAOInterface {
	
	//This method will return every user from the database 
	ArrayList<Users> getUsers();
	//This method will return an User which we'll get by user_id
	Users getUserById (int Id);
	//This method will take add user and insert it into the database
	void addUser (Users user);
	//This method will take add password and insert it into the database
	void addUserpassword (Users user);
	
	
	
	
}
