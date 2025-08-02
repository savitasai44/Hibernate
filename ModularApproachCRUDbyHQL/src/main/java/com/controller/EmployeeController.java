package com.controller;

import com.entities.Employee;
import com.service.EmployeeService;

public class EmployeeController {
	
	public static void main(String[] args) {
		
		EmployeeService es=new EmployeeService();
		Employee e=new Employee();
		
		
		es.InsertData(e);
		es.UpdateData(e);
		es.DeleteData(e);
		es.fetchSigleData(e);
		es.fetchAllData(e);
	}

}
