package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entities.Student;

public class InsertDataWithHQL {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		
		String hqlQuery="insert into Student(age,name,city)values(:age,:name,:city)";
		MutationQuery query=s.createNativeMutationQuery(hqlQuery);
     	query.setParameter("age", 22);
		query.setParameter("name","ovi");
		query.setParameter("city", "beed");
		query.executeUpdate();

		System.out.println("data inserted....");
		tr.commit();
		s.close();
	}
	
}
