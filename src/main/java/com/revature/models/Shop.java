package com.revature.models;

// This class model will have table in our database
public class Shop {

	    @Override
	public String toString() {
		return "Shop [shop_id=" + shop_id + ", brands_type=" + brands_type + ", color_name=" + color_name
				+ ", size_number=" + size_number + ", brands_name=" + brands_name + "]";
	}


		//All variables for the Shop class - must match the Shop table in the database
		//All variables are  private because private coupled with getters and setters (ENCAPSULATION)
		private int shop_id;
		public Shop(String brands_type, String color_name, int size_number, String brands_name) {
			super();
			this.brands_type = brands_type;
			this.color_name = color_name;
			this.size_number = size_number;
			this.brands_name = brands_name;
		}


		private String brands_type;
		private String color_name;
		private int size_number;
		private String brands_name;
	
		
		   
	
		     // Create no args constructor.
		     public Shop() {
			       super();
			       // TODO Auto-generated constructor stub
		}
		    
			
			        // Create args constructors.
					public Shop(int shop_id, String brands_type, String color_name, int size_number, String brands_name
			        ) {
				super();
				this.shop_id = shop_id;
				this.brands_type = brands_type;
				this.color_name = color_name;
				this.size_number = size_number;
				this.brands_name = brands_name;
				
			}
					// I created getter/Setter (ENCAPSULATION) one of the pillar of OOP-Java
			        // Both allows me to access and change variable to private
				  public int getShop_id() {
						return shop_id;
					}


					public void setShop_id(int shop_id) {
						this.shop_id = shop_id;
					}


					public String getBrands_type() {
						return brands_type;
					}


					public void setBrands_type(String brands_type) {
						this.brands_type = brands_type;
					}


					public String getColor_name() {
						return color_name;
					}


					public void setColor_name(String color_name) {
						this.color_name = color_name;
					}


					public int getSize_number() {
						return size_number;
					}


					public void setSize_number(int size_number) {
						this.size_number = size_number;
					}


					public String getBrands_name() {
						return brands_name;
					}


					public void setBrands_name(String brands_name) {
						this.brands_name = brands_name;
					}


			        
	 
}//class ends here

