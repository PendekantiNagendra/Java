package com.hcl.inventory;

import java.util.Scanner;

public class SearchStockMain {
	public static void main(String[] args) {
        String stockid;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stockid");
        stockid = sc.nextLine();
        Stock objstock = StockBal.searchStockBal(stockid);
        if(objstock != null) {
			System.out.println("Item Name :" + objstock.getItemName() );
			System.out.println("Last Name :" + objstock.getPrice() );
			System.out.println("City :" + objstock.getQuantityAvail() );


		} else {
			System.out.println("Account Not Found ");
		}
	}

	}


