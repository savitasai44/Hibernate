
package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


// table annotation create new table create.. @Table(name="studd") create table studd (stud_id integer not null
//auto_increment,age integer not null, city varchar(255), name varchar(255), primary key (stud_id)) engine=InnoDB

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stud_id;
	private int age;
	private String name;
	 // column add city change to address.. @Column(name="address")    alter table Student add column address varchar(255)
	private String city;

	public Student() {

	}

	public Student(int stud_id, int age, String name, String city) {
		super();
		this.stud_id = stud_id;
		this.age = age;
		this.name = name;
		this.city = city;
	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", age=" + age + ", name=" + name + ", city=" + city + "]";
	}

}