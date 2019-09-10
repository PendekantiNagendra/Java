package com.hcl.cms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CollegeCrud {
	
	public String addSubjects(Subjects subject) {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(subject);
		t.commit();
		return "Record Inserted...";
	}

	public String addFeedback(Feedback feedback) {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(feedback);
		t.commit();
		return "Feedback given...";
	}
	
	public static String FeedbackId() {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("select max(fid) from Feedback");
		String fid = "";
		for (Iterator it = q.iterate();it.hasNext();) {
			fid = (String)it.next();
			if (fid == null) {
				fid = "C000";
			}
			int temp = Integer.parseInt(fid.substring(1));
			temp++;
			fid = String.format("C%03d", temp);
		}
		return fid;
	}
    
	public  static List<String> showInstructor() {
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("select distinct instructor from Subjects");
		List lstSubjects=q.list();
		List<String>inslist=new ArrayList<String>();
		for (Object object : lstSubjects) {
		inslist.add((String)object);
		}
		return inslist;
		}
	
	public static List<String> showSubject(String instructor){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("select distinct subject from Subjects where instructor='" +instructor+ " '");
		List<String> lstSubjects=q.list();
		System.out.println(lstSubjects);
		return lstSubjects;
		}
	
	public List<FbCount> getFeedbackCount(String ins, String sub) {
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("select fbvalue,count(*) from Feedback where instructor=? and subject=? group by fbvalue");
		q.setParameter(0, ins);
		q.setParameter(1, sub);
		List list=q.list();
		List<FbCount> res=new ArrayList<FbCount>();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			FbCount fb = new FbCount();
			Object[] o = (Object[])it.next();
			fb.setFbvalue(o[0].toString());
			fb.setCount(Integer.parseInt(o[1].toString()));
			res.add(fb);
		}
	    return res;
	}
}


