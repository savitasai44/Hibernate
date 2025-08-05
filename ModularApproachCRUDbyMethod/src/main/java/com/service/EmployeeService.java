package com.service;

import com.Dao.EmployeeDao;
import com.entities.Employee;

public class EmployeeService {
	
	public void InsertData(Employee e) {
		EmployeeDao ed=new EmployeeDao();
		ed.InsertData(e);
	}
	

	public void UpdateData(Employee e) {
		EmployeeDao ed =new EmployeeDao();
		ed.UpdateData(e);
	}
	
	public void DeleteData(Employee e) {
		EmployeeDao ed= new EmployeeDao();
		ed.DeleteData(e);
	}
	
	
	public void fetchSingleData(Employee e) {
		EmployeeDao ed= new EmployeeDao();
		ed.fetchSingleData(e);
	}
	
	
	
	public void fetchAllData(Employee e) {
		EmployeeDao ed= new EmployeeDao();
		ed.fetchAllData(e);
	}
}
