package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

public class UpdateData {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session =sf.openSession();
		Transaction tr=session.beginTransaction();
		
		int stud_id=2;
		Student s =session.get(Student.class, stud_id);
		s.setName("ganu");
		s.setAge(25);
		s.setCity("gore");
		
		//session.update(s);      deprecated method 
		session.merge(s);
		System.out.println("updated");
		tr.commit();
		session.close();
		
	}

}
