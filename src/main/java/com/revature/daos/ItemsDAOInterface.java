package com.revature.daos;

import java.util.ArrayList;
import com.revature.models.Items;




	//The interface containt abstract method. It be implemented by concrete class
	// Interface are public, abstract by default;
	// This class will help to reference of every that the ShopDAO will show to the costumer
	public interface ItemsDAOInterface {
			
		    //This method will return every shop(items) from the database  
			ArrayList<Items> getItem();
			//This method will return an shop(items) which we'll get by their id
			Items getItemsById(int id);
			//This method will take in an shop(items), and insert it into the database
			void addItems(Items item);
			//This method will edit an shop(items), and add it into the database
			void editItems(Items item);
			//This method will delete an shop(items), and add it into the database
			void deleteItems(Items item);
			
			
			
}
