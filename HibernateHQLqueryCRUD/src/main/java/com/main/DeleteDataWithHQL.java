package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entities.Student;

public class DeleteDataWithHQL {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration ();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		
		String hqlQuery="delete from Student where id=:id";
		Query<Student> query=s.createQuery(hqlQuery);
		query.setParameter("id", 4);
		query.executeUpdate();
		System.out.println("data is deleted....");
		tr.commit();
		s.close();
		
	}

}
