package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentSearch {
	/**
	 * main.
	 *
	 */

  public static void main(String[] args) {
    int empno;
    System.out.println("Enter Department No ");
    Scanner sc = new Scanner(System.in);
    empno = sc.nextInt();
    Connection con = DaoConnection.getConnection();
    String cmd = "select * from Department where deptno = ?";
    try {
      PreparedStatement pst = con.prepareStatement(cmd);
      pst.setInt(1,  empno);
      ResultSet rs = pst.executeQuery();
      if (rs.next()) {
        System.out.println("Department Name " + rs.getString("dname"));
        System.out.println("Location " + rs.getString("loc"));
        System.out.println("Head " + rs.getString("head"));
        } else {
        System.out.println("*** Record Not Found***");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

