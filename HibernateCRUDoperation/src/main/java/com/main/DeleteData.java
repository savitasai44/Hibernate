package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

public class DeleteData {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
    	cfg.configure();
    	cfg.addAnnotatedClass(Student.class);
    	
    	//open session....
    	SessionFactory sf= cfg.buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tr=s.beginTransaction();
		
		//delete data..
		 int stud_id=3;
		 //Student s1=s.load(Student.class,stud_id);   //old method this is deprecated method 
		Student s1=s.get(Student.class,stud_id);
	
    	
    	//s.delete(s1);       deprecated method
		s.remove(s1);
    	System.out.println("data deleted...");
		tr.commit();
		s.close();
				
		

	}

}
