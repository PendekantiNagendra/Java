package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployShow {
  /**
  * main.
  *
  */

  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice", 
           "root", "root");
      //System.out.println("Connected");
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("select * from Employ");
      while (rs.next()) {
    	  System.out.println("Emp no " + rs.getInt("Empno"));
    	  System.out.println("Employ Name " + rs.getString("Name"));
    	  System.out.println("Dept is " + rs.getString("Dept"));
    	  System.out.println("Design is " + rs.getString("Desig"));
    	  System.out.println("Basic is " + rs.getDouble("Basic"));
    	  
      }
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
