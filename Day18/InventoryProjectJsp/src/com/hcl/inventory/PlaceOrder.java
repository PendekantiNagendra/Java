package com.hcl.inventory;

public class PlaceOrder {
	private String stockid;
	private int qnty;
	public String getStockid() {
		return stockid;
	}
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}
	public int getQnty() {
		return qnty;
	}
	public void setQnty(int qnty) {
		this.qnty = qnty;
	}
	
	public String placeOrder() {
		return StockBal.placeOrderBal(stockid, qnty);
	}

}
