package com.hcl.depart;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class DepartmentSearchMain {
	public static void main(String[] args) {
		int deptno = 1;
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from Department");
		List<Department> lst = q.list();
		Department e = lst.get(0);
		if(e != null) {
			System.out.println("Dname " + e.getDname());
			System.out.println("Loc " + e.getLoc());
			System.out.println("Head " + e.getHead());
		} else {
			System.out.println("Record Not Found...");
		}
	}

}
