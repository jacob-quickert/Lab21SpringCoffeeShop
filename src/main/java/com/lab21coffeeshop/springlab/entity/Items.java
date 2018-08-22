package com.lab21coffeeshop.springlab.entity;

public class Items {
	private int itemID;
	private String itemName;
	private String description;
	private String quantity;
	private float price;
	
	public Items() {
		super();
		itemID = 0;
		itemName = "";
		description = "";
		quantity = "";
		price = 0;
	}
	
	public Items(int itemID, String itemName, String description, String quantity, float price) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "itemID=" + itemID + ", itemName=" + itemName + ", description=" + description + ", quantity="
				+ quantity + ", price=" + price;
	}
	
	
	
	
}
