package com.revature.daos;

import java.util.ArrayList;

import com.revature.models.Users;


//DAO stands for Data Access Object - it's the layer of classes that directly interact with our database
//This DAO method should use the inputted username and password in a select statement
public class UsersDAO implements UsersDAOInterface{
	
	//This method will return true in the case of successful login, otherwise it will return false
	public boolean login(String username, String password) {
		
		if(username.equals("user") && password.equals("password")) {
			return true;
		}
		
		return false;
		
	}
	
	// Override those methods
	@Override
	public ArrayList<Users> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users getUserById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(Users user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addUserpassword(Users user) {
		// TODO Auto-generated method stub
		
	}
	
	//Ok Ben hardcoded the credentials... thanks a lot...
	//How might I go about actually checking the DB for username/password?	
	//You'll need a table of users that store usernames and passwords
	//Might I suggest select * from users where username = ? and password = ?;
	//If a record comes back, there IS a username and password matching what the user sent in
	//If "null" comes back, there is no username and password pair matching what the user sent in
	
}