package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	    @Id
	    @GeneratedValue(strategy =GenerationType.IDENTITY)
	    private int eid;
		private String name;
		private long phoneNo;
		private String address;

		
		public Employee()		{
			
		}
		public Employee(int eid, String name, long phoneNo , String address )		{
			super();
			this.eid=eid;
			this.name=name;
			this.phoneNo=phoneNo;
			this.address=address;
		}
		
		
		public int getEid()		{
			return eid;
		}
		public void setEid(int eid)	{
			this.eid=eid;
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		
		
		public long getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(long phoneNo) {
			this.phoneNo=phoneNo;
		}
		
		
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address=address;
		}
		
	
		@Override
		public String toString() {
		return "Employee  [eid="+eid+",name="+name+",phoneNo"+phoneNo+",address="+address+"]";
		}

}
