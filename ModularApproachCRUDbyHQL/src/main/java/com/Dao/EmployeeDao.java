package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entities.Employee;

public class EmployeeDao {
	
	
   // Insert data
	public void InsertData(Employee e) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		
		String hqlQuery="insert into Employee(name,phoneNo,address)values(:name,:phoneNo,:address)";
		MutationQuery query=s.createNativeMutationQuery(hqlQuery);
		query.setParameter("name", "sonali");
		query.setParameter("phoneNo", 256489732);
		query.setParameter("address", "pune");
		query.executeUpdate();
		System.out.println("data inserted ....");
		tr.commit();
		s.close();
	}
	
	
	
	
  // Update data
	public void UpdateData(Employee e) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		
	    String hqlQuery="update Employee set name=:Name,address=:city where eid=:eid";
	    MutationQuery query = s.createMutationQuery(hqlQuery);
	    query.setParameter("Name","dnyanu");
	    query.setParameter("city", "latur");
	    query.setParameter("eid", 2);
	    query.executeUpdate();
	    System.out.println("data is updated.....");
	    tr.commit();
		s.close();
	}
	
	
  //delete data
	public void DeleteData(Employee e) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		
		String hqlQuery="delete from Employee where eid=:myeid ";
		MutationQuery query=s.createNativeMutationQuery(hqlQuery);
	    query.setParameter("myeid", 3);
	    query.executeUpdate();
	    System.out.println("data is delected.....");
	    tr.commit();
	    s.close();
	}  
	
	
   //Fetch Single data
	public void fetchSingleData(Employee e) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
	    Session s= sf.openSession();
	    Transaction tr= s.beginTransaction();
	    
	    String hqlquery ="from Employee where eid=:myeid";
	    Query<Employee> q= s.createQuery(hqlquery);
	    q.setParameter("myeid", 2);
	    Employee e1=q.getSingleResult();
	    System.out.println(e1);
	    tr.commit();
	    s.close();
	}
	
	
 //Fetch all records.
	public void fetchAllData(Employee e) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
	    Session s= sf.openSession();
	    Transaction tr= s.beginTransaction();
	    
	    String hqlquery =" from Employee ";
    	Query<Employee> query= s.createQuery(hqlquery);
        List<Employee> list =query.getResultList();
        for (Employee emp : list) {
	    System.out.println(emp);
        }
       tr.commit();
       s.close();

   }
	

}
