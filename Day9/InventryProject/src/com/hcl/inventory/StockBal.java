package com.hcl.inventory;


public class StockBal {
	
	public static String placeOrderBal(String stockid, int qnty) {
		// TODO Auto-generated method stub
		return new StockDao().placeOrderDao(stockid,qnty);
	}
	
	public static String generateStockidBal() {
		return new StockDao().generateStockidDao();
	}

	public static String addStockBal(Stock stock) {
		return new StockDao().addStockDao(stock);
	}

	public static Stock searchStockBal(String stockid) {
		// TODO Auto-generated method stub
		return new StockDao().searchStockDao(stockid);
	}

	public static Object generateorderid() {
		// TODO Auto-generated method stub
		return new StockDao().generateorderid();
	}

}
