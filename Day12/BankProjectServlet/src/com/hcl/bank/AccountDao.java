package com.hcl.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDao {
  PreparedStatement pst;
  Connection con;
 
  public String withdrawAccountDao(int accountNo, int withdrawAmount) {
	  con = DaoConnection.getConnection();
	  String result = "";
	  Accounts objAccounts = serchAccountDao(accountNo);
	  
	  if (objAccounts != null) {
		   
		   String status = objAccounts.getStatus();
		   if (status.equalsIgnoreCase("inactive")) {
			   result = "Account Closed...";
		   } else {
			   int amount = objAccounts.getAmount();
		   if (amount - withdrawAmount >= 1000) {
			   String cmd = "update Accounts set amount = amount - ? "
						  + " Where AccountNo = ? ";
			   try {
				pst = con.prepareStatement(cmd);
				pst.setInt(1, withdrawAmount);
				pst.setInt(2, accountNo);
				pst.executeUpdate();
				cmd = "Insert into Trans(AccountNo, TransAmount,"
						+ "TransType) values(?,?,?) ";
				pst = con.prepareStatement(cmd);
				pst.setInt(1, accountNo);
				pst.setInt(2, withdrawAmount);
				pst.setString(3, "D");
				pst.executeUpdate();
				result = "Amount Debited...";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  } 
	}
    }else {
		  result = "Account No Not Found...";
	  }
	  return result;
  }
  
  public String depositAccountDao(int accountNo, int depAmount) {
	  con = DaoConnection.getConnection();
	  String result = "";
	  String cmd = "update Accounts set amount = amount + ? "
			  + " Where AccountNo = ? ";
	  Accounts objAccounts = serchAccountDao(accountNo);
	  if (objAccounts == null) {
		  result = "Account No Not Found...";
	  } else {
		  String status = objAccounts.getStatus();
		  if(status.equals("inactive")) {
		  result = "Account Closed...";
		  }else {
			  try {
				pst = con.prepareStatement(cmd);
				pst.setInt(1, depAmount);
				pst.setInt(2, accountNo);
				pst.executeUpdate();
				cmd = "Insert into Trans(AccountNo, TransAmount,"
						+ "TransType) values(?,?,?) ";
				pst = con.prepareStatement(cmd);
				pst.setInt(1, accountNo);
				pst.setInt(2, depAmount);
				pst.setString(3, "c");
				pst.executeUpdate();
				result = "Amount Credited...";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
	  }
	  return result;
  }
  
  public String closeAccountNo(int accountNo) {
	  con = DaoConnection.getConnection();
	  String result = "";
	  Accounts objAccount = serchAccountDao(accountNo);
	if (objAccount == null) {
		  result = "Account No Not Found...";
	  } else {
		  String cmd = "update Accounts set status = 'inactive' "
				  + " Where AccountNo = ? ";
		  try {
			pst = con.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.executeUpdate();
			result = "Account Closed...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  return result;
  }
  


public String updateAccountDao(int accountNo,String city, String state) {
	  con = DaoConnection.getConnection();
	  Accounts objAccounts = serchAccountDao(accountNo);
	  String cmd = "Update accounts set City = ?, State = ? "
			  + "Where AccountNo = ?";
	  String result = "";
	  if (objAccounts == null) {
		  result = "Account No Not Found...";
	  } else {
		  String status = objAccounts.getStatus();
		  if(status.equals("inactive")) {
			  result = "Account Closed Already...";
		  } else {
		    try {
			pst = con.prepareStatement(cmd);
			pst.setString(1, city);
			pst.setString(2, state);
			pst.setInt(3, accountNo);
			pst.executeUpdate();
			result = "Account Updated...";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	  }
	  return result;
  }
  
  
  
  /**
  * method.
  *
  */

  public Accounts serchAccountDao(int accountNo) {
    con = DaoConnection.getConnection();
    String cmd = "select * from Accounts where accountNo = ?";
    Accounts objAccounts = null;
    try {
      pst = con.prepareStatement(cmd);
      pst.setInt(1,  accountNo);
      ResultSet rs = pst.executeQuery();
      if (rs.next()) {
        objAccounts = new Accounts();
        objAccounts.setFirstName(rs.getString("firstName"));
        objAccounts.setLastName(rs.getString("lastName"));
        objAccounts.setCity(rs.getString("city"));
        objAccounts.setState(rs.getString("state"));
        objAccounts.setAmount(rs.getInt("amount"));
        objAccounts.setCheqFacil(rs.getString("cheqFacil"));
        objAccounts.setAccountType(rs.getString("AccountType"));
        objAccounts.setStatus(rs.getString("status"));
        
      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return objAccounts;
  }
  
  /**
   * method.
   *
   */
 
  public String createAccountDao(Accounts objAccounts) {
    con = DaoConnection.getConnection();
    String cmd = "insert into Accounts(AccountNo, FirstName, LastName, "
             + "City, State, Amount, CheqFacil,"
                 + " AccountType)values(?,?,?,?,?,?,?,?)";
    String result = "";
    try {
      pst = con.prepareStatement(cmd);
      pst.setInt(1,  objAccounts.getAccountNo());
      pst.setString(2, objAccounts.getFirstName());
      pst.setString(3, objAccounts.getLastName());
      pst.setString(4, objAccounts.getCity());
      pst.setString(5, objAccounts.getState());
      pst.setInt(6, objAccounts.getAmount());
      pst.setString(7, objAccounts.getCheqFacil());
      pst.setString(8, objAccounts.getAccountType());
      pst.executeUpdate();
      result  = "Account Created Successfully";
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      result = e.getMessage();
    }
    return result;
  }

  /**
  * method.
  *
  */
  
  public int generateAccountNoDao() {
    con = DaoConnection.getConnection();
    int accno = 0;
    String cmd = "Select Case when max(accountNo) is NULL "
        + " THEN 1 else max(accountNo)+1 END accno "
        + " from Accounts";
    try {
      pst = con.prepareStatement(cmd);
      ResultSet rs = pst.executeQuery();
      rs.next();
      accno = rs.getInt("accno");
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return accno;
  }
}
