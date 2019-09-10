package com.hcl.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * class.
 *
 */
public class CustomerDao {
  private static final String Customer = null;
  static List<Customer> lstCustomer = null;
  
  static {
    lstCustomer = new ArrayList<Customer>();
  }

  public String addCustomer(Customer customer) {
    lstCustomer.add(customer);
    return "Customer Created Successfully...";
  }
  /**
   * method.
   *
   */
  
  public static Customer searchCustomerDao(int custId) {
    com.hcl.project.Customer objCustomer = null;
    for (Customer customer : lstCustomer) {
      if (customer.getCustId() == custId) {
        objCustomer = customer;
      }
    }
    return objCustomer;
  }

  public List<Customer> showCustomerDao() {
    return lstCustomer;
  }
  /**
   * method.
   *
   */
  
  public String updateCustomerDao(Customer objCustomer) {
    Customer customer = searchCustomerDao(objCustomer.getCustId());
    if (Customer != null) {
      for (Customer c : lstCustomer) {
        if (c.getCustId() == objCustomer.getCustId()) {
          c.setCustName(objCustomer.getCustName());
          c.setAnnualPremium(objCustomer.getAnnualPremium());
          c.setModalPremium(objCustomer.getModalPremium());
          c.setPaymentMode(objCustomer.getPaymentMode());
        }
      }
      return "Record Updated...";
    } else {
      return "Customer  Id Not Found...";
    }
  }
  /**
   * method.
   *
   */
  
  public String deleteCustomerDao(int sno) {
    Customer customer = searchCustomerDao(sno);
    if (Customer != null) {
      lstCustomer.remove(customer);
      return "Customer Removed...";
    } else {
      return "Customer No Not Found...";
    }
  }
  /**
  * method.
  *
  */
  
  public void writeCustomerFileDao() {
    try {
      FileOutputStream fout = new FileOutputStream("c:/files/student.txt");
      ObjectOutputStream objout = new ObjectOutputStream(fout);
      objout.writeObject(lstCustomer);
      objout.close();
      fout.close();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  /**
  * method.
  *
  */

  public void readCustomerFileDao() {
    try {
      FileInputStream fin = new FileInputStream("c:/files/student.txt");
      ObjectInputStream objin = new ObjectInputStream(fin);
      lstCustomer = (List<Customer>)objin.readObject();
      objin.close();
      fin.close();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

