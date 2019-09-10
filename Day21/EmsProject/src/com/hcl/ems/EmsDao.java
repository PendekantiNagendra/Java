package com.hcl.ems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmsDao {
	
	public boolean LoginDao(int empId, String secretCode) {
		Connection con = DaoConnection.getConnection();
		String cmd = "select * from employLogin where emp_Id=?, secretCode=?";
		 boolean result = false;
		 try {
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, empId);
			pst.setString(2, secretCode);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				result = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public Employ MyAccountDao(int empId) {
		Connection con = DaoConnection.getConnection();
		String cmd = "select * from Employ where emp_Id=?";
		Employ obj = null;
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, empId);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				obj = new Employ();
				obj.setEmpId(empId);
				obj.setEmpName(rs.getString("empName"));
				obj.setEmpEmail(rs.getString("empEmail"));
				obj.setEmpMobNo(rs.getInt("empMoNo"));
				obj.setEmpDateJoined(rs.getDate("empDateJoined"));
                obj.setEmpDeptName(rs.getString("empDeptName"));
                obj.setEmpLeaveBal(rs.getInt("empLeaveBal"));
                obj.setEmpMgrId(rs.getInt("empMgrId"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	public 
	public String approve(int empid) {
		Connection con=DaoConnection.getConnection();
		String cmd = 
	}

}
