package com.hcl.inventory;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class AddStockServlet
 */
public class AddStockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStockServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Stock objStock = new Stock();
		String stockid = new StockDao().generateStockidDao();
		objStock.setStockid("stockid");
		objStock.setItemName(request.getParameter("ItemName"));
		double Price = Double.parseDouble(request.getParameter("Price"));
		int QuantityAvail = Integer.parseInt(request.getParameter("QuantityAvail"));
		
        String result = StockBal.addStockBal(objStock);
		
		PrintWriter out = response.getWriter();
		out.println(result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
