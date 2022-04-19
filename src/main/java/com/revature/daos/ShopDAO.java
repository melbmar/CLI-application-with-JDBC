package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import com.revature.models.Shop;
import com.revature.models.Users;
import com.revature.utils.ConnectionUtil;



// DAO stands for Data Access Object - it's the layer of classes that directly interact with our database
public class ShopDAO implements ShopDAOInterface {
	


			public Shop getShopById(int id) {
				try(Connection conn = ConnectionUtil.getConnection()){
					String sql = "select * from shop where shop_id=?";
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.setInt(1, id);
					ResultSet rs = ps.executeQuery();
					    while(rs.next()) {
					    	 return new Shop(
					    	   rs.getInt("shop_id"),
					 		   rs.getString("brands_type"),
					 		   rs.getString("color_name"),
					 		   rs.getInt("size_number"),
					 		   rs.getString("brands_name")
					    			 );
					           }
					
					
				} catch (SQLException e) {
					System.out.println("Something went wrong with shop looking !");
					e.printStackTrace();
					
				}
				return null;
			}
		 
			@Override
			public void updateShopBrandsName(String brands_type, String brands_name) {
				try(Connection conn = ConnectionUtil.getConnection()){
					
					//write out our SQL UPDATE command
					String sql = "update shop set brands_type = ? where brands_name = ?";
					
					PreparedStatement ps = conn.prepareStatement(sql);
					
					ps.setString(1, brands_type);
					ps.setString(2, brands_name);
					
					ps.execute();
					
					System.out.println(brands_type + " has been updated to: " + brands_name + " thank you for make this change. ");
					
				} catch (SQLException e) {
					System.out.println("    Couldn't update !");
					e.printStackTrace();
					
				}
				return;
				
			}
			
			public void deleteShop(String brands_type) {
				try(Connection conn = ConnectionUtil.getConnection()){
					String sql = "delete from shop where brands_name = ?;";
					
					//instantiate our PreparedStatement to fill in the variable
					PreparedStatement ps = conn.prepareStatement(sql);
					
					ps.setString(1, brands_type);
					
					//ps.executeUpdate() to send our delete to the DB
					ps.executeUpdate();
					//ps.executeQuery();
					
					System.out.println("     Get delete shop #" + brands_type);
					
					
				} catch (SQLException e) {
					System.out.println(" Can't delete this shop ^_^ ");
					e.printStackTrace();
				}
				
				
			}

			
			
			@Override
			public void addShop(Shop shop) {
				 try(Connection conn = ConnectionUtil.getConnection()){
					 
					  //String will connect put send(inside) of the database
					  String sql = "insert into shop (brands_type, color_name, size_number, brands_name)" 
					   + " values (?,?,?,?);"; 
					  
	                    //Instantiate a PreparedStatement to fill in the variables of our initial SQL String
					    PreparedStatement ps = conn.prepareStatement(sql);
					  
					    //ps.setInt(1, shop.getShop_id());
						ps.setString(1, shop.getBrands_type());
						ps.setString(2, shop.getColor_name());
						ps.setInt(3, shop.getSize_number());
						ps.setString(4, shop.getBrands_name());
						
						//Execute the Update!! (the method is called executeUpdate(), but it's for INSERTS, UPDATES, and DELETES)
						ps.executeUpdate();
						
						//Tell the user the insert was successful
					    System.out.println("          New Shop" + shop.getBrands_name() + ", " + shop.getColor_name() +  ", "
					    		                     + shop.getColor_name() + ", " + shop.getSize_number() + ", " 
					    		                     + shop.getBrands_name()+ " was added successfully.");
					    		                    
			   
			 } catch (SQLException e) {
			System.out.println("Something happened inserting Your Information !");
				e.printStackTrace();}
			 }

	
			
			

			@Override
			public Shop getShopByBrands_name(String brand_name) {
				// TODO Auto-generated method stub
				return null;
			}


		public void editShop(Shop shop) {
			// TODO Auto-generated method stub
		}

		@Override
		public ArrayList<Shop> getAllShop() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ArrayList<Shop> getShop() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void deleteShop(Shop shop) {
			// TODO Auto-generated method stub
			
		}




		

} // The End of the class 
