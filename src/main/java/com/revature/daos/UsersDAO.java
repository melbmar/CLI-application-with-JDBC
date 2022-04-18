package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import com.revature.models.Users;
import com.revature.utils.ConnectionUtil;


//DAO stands for Data Access Object - it's the layer of classes that directly interact with our database
//This DAO method should use the inputted username and password in a select statement
public class UsersDAO implements UsersDAOInterface{
	      
	      // Account administrations.
          public boolean login(String username, String password) {
		
		        if(username.equals("Mel") && password.equals("1234")) {
			     return true;
		}
		
		return false;
		
	}
	
	// Override those methods
	@Override
	public void addUsers(Users user) {
		 //The first thing we do in DAO methods is open a Connection to our database
		 try(Connection conn = ConnectionUtil.getConnection()){
			 
			  //String will connect put send(inside) of the database
			  String sql = "insert into users (first_name, second_name, username, userpassword)" 
			   + " values (?,?,?,?);"; 
			  
			  

              //Instantiate a PreparedStatement to fill in the variables of our initial SQL String
			  PreparedStatement ps = conn.prepareStatement(sql);
			    
			  
			  //fill in the values of our variables using ps.setXYZ()
			  ps.setString(1, user.getFirst_name());
			  ps.setString(2, user.getSecond_name());
			  ps.setString(3, user.getUsername());
			  ps.setString(4, user.getUserpassword());
			  
			  //Execute the Update!! (the method is called executeUpdate(), but it's for INSERTS, UPDATES, and DELETES)
			  ps.executeUpdate();
			  //ps.executeQuery();
                 	
				    //Tell the user the insert was successful
				    System.out.println("      'Welcome Oboard ' ");
		   
		 } catch (SQLException e) {
		System.out.println("Something happened inserting Your Information !");
			e.printStackTrace();}
		 }

	
	@Override
	public ArrayList<Users> displayUsers() {
		try(Connection conn = ConnectionUtil.getConnection()){
			//a String that will represent our SQL statement
			String sql = "select * from users;";
			//a Statement object to execute our query 
			Statement s = conn.createStatement();
			//executeQuery() is what actually queries the database! Then we put the records into a ResultSet
			ResultSet rs = s.executeQuery(sql);
			//Instantiate an ArrayList to put our user objects into
			ArrayList<Users> usersList = new ArrayList<>();
			//use rs.next() in a while loop to create Users objects and populate our ArrayList with them.
			//the ResultSet is what's holding our data. We need to turn it into something Java can read (objects)
			while(rs.next()) {
				//Create a new Users object from each record in the ResultSet
				//we're using the all args constructor of Employee to fill in new Employee objects with DB data
			    Users us = new Users(
			    		rs.getString("first_name"),
			    		rs.getString("second_name"),
			    		rs.getString("username"),
			    		rs.getString("userpassowrd")
			    		);
			    
			    us.setUsername(sql);
			    //use .add() to populate our ArrayList with each new User object
				usersList.add(us);
			
			}
			
			//when there are no more results in the ResultSet, the while loop will break... because rs.next() == false
			//return the populated list of users!!!!
			return usersList;
			
		} catch (SQLException e) {
			System.out.println("Something went wrong contacting the database!");
			e.printStackTrace(); //this method is what prints an error message if something goes wrong
		}
		
		
		return null;
	}


	@Override
	public ArrayList<Users> getUsers(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Users> getUsersbyFirstName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Users> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}


	
	
	
	//Ok Ben hardcoded the credentials... thanks a lot...
	//How might I go about actually checking the DB for username/password?	
	//You'll need a table of users that store usernames and passwords
	//Might I suggest select * from users where username = ? and password = ?;
	//If a record comes back, there IS a username and password matching what the user sent in
	//If "null" comes back, there is no username and password pair matching what the user sent in
	
