package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		int empno = 1;
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Employ e = new Employ();
		e.setEmpno(11);
		e.setName("Raj");
		e.setDept("Hiber");
		e.setDesig("Full");
		e.setBasic(50000);
		s.save(e);
		Transaction obj = s.getTransaction();
		obj.begin();
		obj.commit();
		System.out.println("Inserted....");
	}
}
