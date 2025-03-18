package com.programming.class1;

import java.util.Comparator;

public class Employee2 implements Comparable<Employee2> {
	
	private int id;
	private String name;
	private int age;
	private long salary;
	private String gender;
	private String dept;
	private String city;
	private int yoj;
	
	public Employee2(int id, String name, int age, String gender, String dept, String city, int yoj, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary=salary;
		this.gender = gender;
		this.dept = dept;
		this.city = city;
		this.yoj = yoj;
	}
	
	
	@Override
	public String toString() {
		return "Employee details: " + id + name + age + +salary+ gender + dept + city + yoj  ;
	}


	@Override
	public int compareTo(Employee2 o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
	public static Comparator<Employee2> nameComparator = new Comparator<>() {
		@Override
		public int compare(Employee2 o1, Employee2 o2) {
			return o1.getName().compareTo(o2.getName());
		}
	};
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}}
