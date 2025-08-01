package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entities.Student;

public class UpdateDataWithHQL {

	public static void main(String[] args) {
	
		Configuration cfg = new Configuration ();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery="update Student set name=:Name,city=:address where stud_id=:id";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("Name","dnyanu");
		query.setParameter("address", "latur");
		query.setParameter("id", 5);
		query.executeUpdate();
		System.out.println("data is updated.....");
		tr.commit();
		ss.close();

	}

}
