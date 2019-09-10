package com.hcl.depart;

import java.util.Iterator;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class DepartmentInsertMain {
	
	public static void main(String[] args) {
		Department e = new Department();
		Scanner sc = new Scanner(System.in);
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		int deptno=0;
		Query q = s.createQuery("select max(deptno) from Department");
		for(Iterator it=q.iterate(); it.hasNext();) {
			deptno = (Integer)it.next();
		}
		deptno++;
		System.out.println("Deptno" + deptno);
		e.setDeptno(deptno);
		
		System.out.println("Enter Name :");
		String dname= sc.nextLine();
		e.setDname(dname);
		
		System.out.println("Enter Loc :");
		String loc= sc.nextLine();
		e.setLoc(loc);
		
		System.out.println("Enter Head :");
		String head= sc.nextLine();
		e.setHead(head);
		
		 
	   s.save(e);
	   Transaction t = s.getTransaction();
	   t.begin();
	   t.commit();
	   System.out.println("Inserted Successfully....");
	   
	}

}
