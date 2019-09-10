package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentUpdate {
	public static void main(String[] args) {
		int deptno;
		String dname, loc;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Department No");
		deptno = sc.nextInt();
		System.out.println("Department Name");
		dname = sc.next();
		System.out.println("Location");
		loc = sc.next();
		String cmd = "update Department set dname = ?, loc = ? where deptno = ?";
		Connection con = DaoConnection.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(3,  deptno);
			pst.setString(1,  dname);
			pst.setString(2,  loc);
			pst.executeUpdate();
			System.out.println("***Record Updated***");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
