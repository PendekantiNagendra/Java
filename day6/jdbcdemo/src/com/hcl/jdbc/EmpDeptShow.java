package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDeptShow {
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
      ResultSet rs = st.executeQuery("select * from Emp");
      while (rs.next()) {
        System.out.println("Emp no " + rs.getInt("Empno"));
        System.out.println("Employ Name " + rs.getString("ename"));
        System.out.println("Job is " + rs.getString("job"));
        System.out.println("mgr is " + rs.getString("mgr"));
        System.out.println("Hire date is " + rs.getDate("hiredate"));
        System.out.println("Salary is " + rs.getDouble("sal"));
        System.out.println("Comm is " + rs.getInt("hiredate"));
        System.out.println("Depart No is " + rs.getDouble("deptno"));
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
