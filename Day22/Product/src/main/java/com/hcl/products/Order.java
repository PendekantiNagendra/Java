package com.hcl.products;

public class Order {
	private int qtyord;
	private int ordid;
	private Product objproduct;
	
	public int getQtyord() {
		return qtyord; 
	}
	public void setQtyord(int qtyord) {
		this.qtyord = qtyord;
	}
	public int getOrdid() {
		return ordid;
	}
	public void setOrdid(int ordid) {
		this.ordid = ordid;
	}
	public Product getObjproduct() {
		return objproduct;
	}
	public void setObjproduct(Product objproduct) {
		this.objproduct = objproduct;
	}
	
	public void display() {
		System.out.println("Quantity ordered :" + qtyord + "Order ID :" + ordid);
		objproduct.product();
	}

}
