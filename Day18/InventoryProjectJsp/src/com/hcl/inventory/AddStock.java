package com.hcl.inventory;

public class AddStock {
	private String itemName;
	private double price;
	private int quantityAvail;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantityAvail() {
		return quantityAvail;
	}
	public void setQuantityAvail(int quantityAvail) {
		this.quantityAvail = quantityAvail;
	}
	
	public String addStock() {
		Stock obj = new Stock();
		obj.setStockid(StockBal.generateStockidBal());
		obj.setItemName(itemName);
		obj.setPrice(price);
		obj.setQuantityAvail(quantityAvail);
		return StockBal.addStockBal(obj);
	}

}
