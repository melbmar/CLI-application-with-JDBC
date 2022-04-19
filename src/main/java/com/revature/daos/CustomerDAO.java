package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.models.Customer;
import com.revature.models.Shop;
import com.revature.utils.ConnectionUtil;




//DAO stands for Data Access Object - it's the layer of classes that directly interact with our database
public class CustomerDAO implements CustomerDAOInterface {
	
	
	    //Instantiate a RoleDAO object so that we can use one of it's methods in the getEmployees() method
		ShopDAO shopDAO = new ShopDAO();
		

	
	
	@Override
	public ArrayList<Customer> getCustomerByshop(String brands_name) {
		try(Connection conn = ConnectionUtil.getConnection()){
			//since I want to get customer by their brands_name, I need access to the data in both tables
			String sql = "select * from customer inner join shop "
					+ "on shop_id = shop_id_fk where brands_name = ?;";
			//we have a variable in the SQL statement, so we need a PreparedStatement to fill it in
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//now we just need to input the variable value
			ps.setString(1, brands_name);
			//Execute the query into a ResultSet object
			ResultSet rs = ps.executeQuery();
			
			//Instantiate an empty ArrayList that we'll fill with the data from the ResultSet
			ArrayList<Customer> customerList = new ArrayList<>();
			//while there are records remaining in the ResultSet...
			while(rs.next()) {
				
				//create new Employee objects based on the data, and fill in the ArrayList
				Customer e = new Customer(
						rs.getString("first_name"),
						rs.getString("second_name"),
						rs.getString("email"),
						rs.getString("address"),
						null
						
						);
						

				//get the foreign key from the shop table to use in our getcustomerbyshop() method
				String shopFK = rs.getString("shop_id_fk");
				
				Shop c = shopDAO.getShopByBrands_name(shopFK);
				
				//fill in the previously null Role variable in this new Employee object (with the setter!)
				 e.setShop(c);
				//fill in the employeeList with each while loop until eventually rs.next() == false.
				customerList.add(e);
			}
				return customerList;	
			
		} catch (SQLException e) {
			System.out.println("Something went wrong selecting customer by brands_name");
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public void addCustomer(Customer customer) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "insert into customer (first_name, second_name, email, address)"
					+ "values(?,?,?,?);";
			//String will connect put send(inside) of the database
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//fill in the values of our variables using ps.setXYZ()
			//ps.setInt(1,customer.getCustomer_id());
			ps.setString(1, customer.getFirst_name());
			ps.setString(2, customer.getSecond_name());
			ps.setString(3, customer.getEmail());
			ps.setString(4, customer.getAddress());
			
			
			    //Execute the Update!! (the method is called executeUpdate(), but it's for INSERTS, UPDATES, and DELETES)
			     ps.executeUpdate();
			     
			          System.out.println("     The New  Customer " + customer.getFirst_name() +" "+ customer.getSecond_name()+ " was added in our system " );
			
		} catch (SQLException e) {
			System.out.println("Something went wrong inserting Customer!");
			e.printStackTrace();
			
		}
		
	}

	@Override
	public Customer getCustomerByID(int id) {
		       
		return null;
	}

	

	@Override
	public ArrayList<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCustomer(Customer customer, int shop_id) {
		// TODO Auto-generated method stub
		
	}



	

	
	
	
		           


					
		            
		   
		
	
		
			

}
