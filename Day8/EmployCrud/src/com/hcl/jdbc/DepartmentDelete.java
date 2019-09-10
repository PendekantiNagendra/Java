package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentDelete {
	public static void main(String[] args) {
		int deptno;
		String dname, loc;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Department No");
		deptno = sc.nextInt();
		String cmd = "Delete from Department where deptno = ?";
		Connection con = DaoConnection.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1,  deptno);
			pst.executeUpdate();
			System.out.println("***Record Deleted***");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
