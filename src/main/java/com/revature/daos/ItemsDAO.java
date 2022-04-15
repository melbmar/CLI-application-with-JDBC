package com.revature.daos;

import java.util.ArrayList;
import com.revature.models.Items;
import com.revature.models.Shop;


public class ItemsDAO implements ItemsDAOInterface{
	
	    // The ArrayList of shop objects that, which will act from the database
		ArrayList<Items> itemsList = new ArrayList<>();
		
		Shop shopcon = new Shop (1, " Canvas Platform Chuck Taylor All Star ", " White ", 7);
		Shop shopvan = new Shop (2, " Era™ Core Classics ", "Black", 6);
		Shop shopfil = new Shop (3, " Women's Disruptor 2 Wedge  ", " Pink ", 8);
		
		            
		//Instantiate some type Objects that the costumer will see
        //This method will be communicating directly with to the database
	    //we're using the all-args constructor which takes in an type and price
		public ArrayList<Items> getItems(){
			itemsList.add(new Items (1, " Converse ", (float) 50.00));
			itemsList.add(new Items (2, " Vanz ", (float) 45.00));
			itemsList.add(new Items (3, " Fila ", (float) 101.00));
			
			      return itemsList;
		}
		
		       
	
	// Override those methods
	@Override
	public Items getItemsById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addItems(Items item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editItems(Items item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteItems(Items item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Items> getItem() {
		// TODO Auto-generated method stub
		return null;
	}

}
