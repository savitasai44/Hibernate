package com.service;

import com.Dao.EmployeeDao;
import com.entities.Employee;

public class EmployeeService {
	
	
	//Insert data
	public void InsertData(Employee e) {
		EmployeeDao ed=new EmployeeDao();
		ed.InsertData(e);
	}
	
	
	//Update data
	public void UpdateData(Employee e) {
		EmployeeDao ed=new EmployeeDao();
		ed.UpdateData(e);
	}
	

	//delete data
	public void DeleteData(Employee e) {
		EmployeeDao ed=new EmployeeDao();
		ed.DeleteData(e);
	}
	
	
	//Fetch Single data
	public void fetchSigleData(Employee e) {
		EmployeeDao ed = new EmployeeDao();
		ed.fetchSingleData(e);
	}
	
	//Fetch all records
	public void fetchAllData(Employee e) {
		EmployeeDao ed = new EmployeeDao();
		ed.fetchAllData(e);
	}
	
}
