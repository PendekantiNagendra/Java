package com.hcl.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */
public class AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
		
		Cookie ckAnand = new Cookie("Anand", "52");
		ckAnand.setMaxAge(1000*60*60*24);
		response.addCookie(ckAnand);
		
		Cookie ckBindu = new Cookie("Bindu", "74");
		ckAnand.setMaxAge(1000*60*60*24);
		response.addCookie(ckBindu);
		
		Cookie ckTushar = new Cookie("Tushar", "62");
		ckAnand.setMaxAge(1000*60*60*24);
		response.addCookie(ckTushar);
		
		Cookie ckYash = new Cookie("Yash", "88");
		ckAnand.setMaxAge(1000*60*60*24);
		response.addCookie(ckYash);
		
		Cookie ckRishab= new Cookie("Rishab", "76");
		ckAnand.setMaxAge(1000*60*60*24);
		response.addCookie(ckRishab);
		
		out.println("Cookie Created Successfully <br/><br/>");
		out.println("<a href = 'ShowCookieServlet'>show cookie</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
