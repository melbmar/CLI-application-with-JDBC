package com.revature.daos;

import java.util.ArrayList;

import com.revature.models.Items;
import com.revature.models.Shop;



// DAO stands for Data Access Object - it's the layer of classes that directly interact with our database
public class ShopDAO implements ShopDAOInterface {
	
	// The ArrayList of shop objects that, which will act from the database
	ArrayList<Shop> shopList = new ArrayList<>();
	
    //Instantiate some type Objects that the costumer will see
	Items itemcon = new Items (1, " Converse ", (float) 50.00);
	Items itemvan = new Items (2, " Vanz ", (float) 45.00);
	Items itemfil = new Items (3, " Fila ", (float) 101.00);
	
	      
	        public ArrayList<Shop> getShop(){
	        //Instantiate some type Objects that the costumer will see
	        //This method will be communicating directly with to the database
		    //we're using the all-args constructor which takes in an id, brands, color, size
	        shopList.add(new Shop(1, " Canvas Platform Chuck Taylor All Star ", " White ", 7));
	        shopList.add(new Shop(2, " Era™ Core Classics", "Black", 6));
	        shopList.add(new Shop(3, " FWomen's Disruptor 2 Wedge ", " Pink ", 8));
	       
	             return shopList;
	        }


			public Shop getShopById(int id) {
				// TODO Auto-generated method stub
				return null;
			}


			public void addShop(Shop shop) {
				// TODO Auto-generated method stub
				
			}


			public void editShop(Shop shop) {
				// TODO Auto-generated method stub
				
			}


			public void deleteShop(Shop shop) {
				// TODO Auto-generated method stub
				
			}

            
	       
    
} // The End of the class 
