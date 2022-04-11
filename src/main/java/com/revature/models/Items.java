package com.revature.models;

public class Items {
	
	
	
	private int items_id;
	private String brands_name;
	private float price;

		
	    // It will show no args constructor in this area
	    public Items() {
		        super();
	          }
	    
	    // Be args Constructor 
	    public Items(int items_id, String brands_name, float price) {
			super();
			this.brands_name = brands_name;
			this.price = price;
		}
	    
		
		// Be need to prints the objects and variables Strings
	    @Override
		public String toString() {
			return "Items [items_id=" + items_id + ", brands_name=" + brands_name + ", price=" + price + "]";
		}

	    
	    
        // Getters and Setters
		public int getItems_id() {
			return items_id;
		}

		public void setItems_id(int items_id) {
			this.items_id = items_id;
		}

		public String getBrands_name() {
			return brands_name;
		}

		public void setBrands_name(String brands_name) {
			this.brands_name = brands_name;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}
	    
}  //class ends here   
