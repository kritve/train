package com.programming.class1;

public class EmpData {

	int empId;
	String empName;
	int empAge;

	EmpData() {
		empId = 999;
		empName = "  ABC  ";
		empAge = 25;
	}

	EmpData(int empId) {
		this.empId = empId;
		empName = "  ABC  ";
		empAge = 25;
	}

	void display() {
		System.out.println(empId + empName + empAge);
	}

	public static void main(String[] args) {
		EmpData e1 = new EmpData();
		e1.display();
		EmpData e2 = new EmpData(123);
		e2.display();
	}
}
