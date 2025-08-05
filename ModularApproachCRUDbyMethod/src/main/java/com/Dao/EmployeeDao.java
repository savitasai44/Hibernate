package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class EmployeeDao {
	
	
 //Insert data	
	public void InsertData(Employee e) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		Employee e1= new Employee();
		e1.setName("jana");
		e1.setPhoneNo(526389741);
		e1.setAddress("solapur");
		//s.save(e);                   //deprecated save method
		s.persist(e1);               //save method
		System.out.println("data inserted....");
		tr.commit();
		s.close();
	}
	
	
//Update data
	public void UpdateData(Employee e){
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		int eid=14;
		Employee e1=s.get(Employee.class, eid);
		e1.setName("cutiii");
		e1.setPhoneNo(66589324);
		e1.setAddress("latur");
		s.update(e1);
		s.merge(e1);
		System.out.println("Data updated successfully...");
		tr.commit();
		s.close();
		
	}
	
	
//delete data
	public void DeleteData(Employee e)
	{
		Configuration cfg= new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		int eid=26;
		Employee e1=s.get(Employee.class, eid);
		s.delete(e);
		s.remove(e);
		System.out.println("data is deleted..");
		tr.commit();
		s.close();
	}
	
	
	
	
//fetchSingle data
	public void fetchSingleData(Employee e) {
		Configuration cfg= new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr= s.beginTransaction();
	    Employee e1=s.get(Employee.class, 1);
	    System.out.println(e1);
	    tr.commit();
	    s.close();
	}
	
	
	
//fetchAllData
	public void fetchAllData(Employee e) {
		Configuration cfg= new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr= s.beginTransaction();
		CriteriaBuilder hcb=s.getCriteriaBuilder();
    	CriteriaQuery<Object> cb=hcb.createQuery();
    	Root<Employee> root=cb.from(Employee.class);
    	cb.select(root);
       	Query query=s.createQuery(cb);
    	List<Employee>list=query.getResultList();
    	for(Employee stu :list)
    	{
    		System.out.println(stu);
    	}
    	
		
	}

}
