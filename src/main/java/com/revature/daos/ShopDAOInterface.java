package com.revature.daos;

import java.util.ArrayList;
import com.revature.models.Shop;

//The interface containt abstract method. It be implemented by concrete class
// Interface are public, abstract by default;
// This class will help to reference of every that the ShopDAO will show to the costumer
public interface ShopDAOInterface {
		
	    //This method will return every shop(items) from the database  
		ArrayList<Shop> getShop();
		//This method will return an shop(items) which we'll get by their id
		Shop getShopById(int id);
		//This method will take in an shop(items), and insert it into the database
		void addShop(Shop shop);
		//This method will edit an shop(items), and add it into the database
		void editShop(Shop shop);
		//This method will delete an shop(items), and add it into the database
		void deleteShop(Shop shop);
		
}
