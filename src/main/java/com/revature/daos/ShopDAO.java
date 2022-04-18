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
			public void updateShopBrandsName(String brands_type, int size_number) {
				try(Connection conn = ConnectionUtil.getConnection()){
					
					//write out our SQL UPDATE command
					String sql = "update shop set shop_size-number = ? where shop_brands_type = ?";
					
					PreparedStatement ps = conn.prepareStatement(sql);
					
					ps.setInt(1, size_number);
					ps.setString(2, brands_type);
					
					ps.execute();
					
					System.out.println(brands_type + " salary has been updated to: " + size_number);
					
				} catch (SQLException e) {
					System.out.println("Couldn't update !");
					e.printStackTrace();
					
				}
				return;
				
			}
			
			public void deleteShop(int Id) {
				try(Connection conn = ConnectionUtil.getConnection()){
					String sql = "delete from shop where shop_id = ?;";
					
					PreparedStatement ps = conn.prepareStatement(sql);
					
					ps.setInt(1, Id);
					
					ps.executeUpdate();
					
					System.out.println("Get delete shop #" + Id);
					
					
				} catch (SQLException e) {
					System.out.println(" Can't delete this shop ^_^ ");
					e.printStackTrace();
				}
				
				
			}

			
			
			@Override
			public void addShop(Shop shop) {
				
				
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
