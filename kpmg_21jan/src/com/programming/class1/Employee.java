package com.programming.class1;

public class Employee {
	String empName;
	int empAge;
	String empDesignation;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	double empSalary;
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpAge(25);
		emp.setEmpDesignation("Software engineer");
		emp.setEmpName("ABC");
		emp.setEmpSalary(70000.00);
		
		System.out.println("Name: " + emp.getEmpName());
		System.out.println("Age: " + emp.getEmpAge());
		System.out.println("Designation: " + emp.getEmpDesignation());
		System.out.println("Name: " + emp.getEmpSalary());
	}
}
