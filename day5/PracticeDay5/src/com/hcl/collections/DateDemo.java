package com.hcl.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

  /**
  * main.
  *
  */

  public static void main(String[] args) {
    Date dt = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    System.out.println(sdf.format(dt));
    String strDate = "09/03/2019";
    try {
      Date obj = sdf.parse(strDate);
    } catch (ParseException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
