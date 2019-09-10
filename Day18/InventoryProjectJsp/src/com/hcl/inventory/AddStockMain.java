package com.hcl.inventory;

import java.util.Scanner;

public class AddStockMain {
	private static final String ItemName = null;

	public static void main(String[] args) {
		String stockid = StockBal.generateStockidBal();
		System.out.println(stockid);
		Stock obj = new Stock();
		Scanner sc = new Scanner(System.in);
		obj.setStockid(stockid);
		System.out.println("Enter Item Name ");
		obj.setItemName(sc.nextLine());
		System.out.println("Enter price ");
		obj.setPrice(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter QuantityAvail ");
		obj.setQuantityAvail(sc.nextInt());
		System.out.println(StockBal.addStockBal(obj));
	}

}
