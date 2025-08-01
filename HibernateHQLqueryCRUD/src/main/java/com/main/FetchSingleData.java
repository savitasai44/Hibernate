package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

public class FetchSingleData {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration ();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
	//fetch single record logic	
		System.out.println("Data is deleted...");
		tr.commit();
		ss.close();


	}

}
