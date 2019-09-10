package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployUpdate {
	public static void main(String[] args) {
		int empno, basic;
		String name, desig;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No");
		empno = sc.nextInt();
		System.out.println("Designation");
		desig = sc.next();
		System.out.println("Basic");
		basic = sc.nextInt();
		String cmd = "update Employ set Desig = ?, Basic = ? where empno = ?";
		Connection con = DaoConnection.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(3,  empno);
			pst.setString(1,  desig);
			pst.setInt(2,  basic);
			pst.executeUpdate();
			System.out.println("***Record Updated***");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
