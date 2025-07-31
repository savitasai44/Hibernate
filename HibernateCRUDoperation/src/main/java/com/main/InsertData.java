package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Student;


public class InsertData {
    public static void main(String[] args) throws Exception{
    	
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	cfg.addAnnotatedClass(com.entities.Student.class);
    	
    	//open session....
    	SessionFactory sf= cfg.buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tr=s.beginTransaction();
    	
    	//create student object.....
    	Student stu=new Student();
    	stu.setName("durga");
    	stu.setAge(20);
    	stu.setCity("kej");
    	
    	//save to Database.........
    	         // s.save(stu);   old method now this is deprecation method not used new method are persist
    	s.persist(stu);
    	tr.commit();
    	s.close();
    	
    	//create query data inserted
    	System.out.println("data inserted successfully....");
    	
    }
}

