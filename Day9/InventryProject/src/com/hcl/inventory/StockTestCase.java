package com.hcl.inventory;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Stack;

import org.junit.Test;

import com.mysql.jdbc.PreparedStatement;


public class StockTestCase {
	@Test
	public void testAddStock() {
		Stock obj = new Stock();
		obj.setStockid(StockBal.generateStockidBal());
		obj.setItemName("Iphone");
		obj.setPrice(98000);
		obj.setQuantityAvail(10);
		
		assertEquals("Stock Added...", StockBal.addStockBal(obj));
	}
	
	@Test
	public void SearchStock() {
		assertNotNull(StockBal.searchStockBal("S001"));
		assertNull(StockBal.searchStockBal("S101"));
	}
	
	@Test
	public void testPlaceOrder() {
		assertEquals("Order Placed",StockBal.placeOrderBal("S001", 1));
	}
	@Test
	public void testGenerateorderid() {
		Connection con = DaoConnection.getConnection();
		PreparedStatement pst = null;
		int orderid = 0;
		String cmd = "Select case when Max(orderid) is Null"
				  + " then 1 else Max(orderid)+1 End orderNo "
				  + "from orders";
		try {
			pst = (PreparedStatement) con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				orderid = rs.getInt("orderNo");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	Object generateorderid = null;
		assertEquals(orderid,StockBal.generateStockidBal());
	}
	
	@Test
	public void testGenerateStockid() {
		 Connection con = DaoConnection.getConnection();
		String stockid = null;
		String cmd = "Select max(stockid) sid from stock";
		String stid = "";
		try {
			 PreparedStatement pst = (PreparedStatement) con.prepareStatement(cmd);
			 ResultSet rs = pst.executeQuery();
		      rs.next();
		      stid = rs.getString("sid");
		      int id = Integer.parseInt(stid.substring(1));
		      id++;
		      stockid = String.format("S%03d", id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    assertEquals(stockid, StockBal.generateStockidBal());
	}
	
	@Test
	public void testDaoConnection() {
		assertNotNull(DaoConnection.getConnection());
	}
	
	@Test
	public void testToString() {
		assertNotNull(new Stock().toString());
	}
	@Test
	public void testGettersAndSetters() {
		Stock objStock = new Stock();
		objStock.setStockid("S001");
		objStock.setItemName("Iphone");
		objStock.setPrice(98000);
		objStock.setQuantityAvail(10);
		
		assertEquals("S001", objStock.getStockid());
		assertEquals("Iphone", objStock.getItemName());
		assertEquals(98000, objStock.getPrice(),0.00);
		assertEquals(10, objStock.getQuantityAvail());
	}

}
