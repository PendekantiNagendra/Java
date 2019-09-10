package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptSearch {
  /**
  * main.
  *
  */

  public static void main(String[] args) {
    int deptno;
    System.out.println("Enter Department Number ");
    Scanner sc = new Scanner(System.in);
    deptno = sc.nextInt();
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice",
          "root", "root");
      String cmd = "select * from Dept where deptno = ?";
      PreparedStatement pst = con.prepareStatement(cmd);
      pst.setInt(1,  deptno);
      ResultSet rs = pst.executeQuery();
      if (rs.next()) {
        System.out.println("Department Name :" + rs.getString("dname"));
        System.out.println("Department Location :" + rs.getString("loc"));
      } else {
        System.out.println("*** Record Not Found***");
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
