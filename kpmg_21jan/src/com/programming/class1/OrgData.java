package com.programming.class1;

public class OrgData {
	
	int empId;
	String empName;
	int empAge;
	
	//static
	static String orgAddress;
	
	OrgData(int empId, String empName, int empAge){
		this.empAge=empAge;
		this.empId=empId;
		this.empName=empName;
	}

	static {
		orgAddress = " ABC ";
	}
	
	void display() {
		System.out.println(empId+" "+empName+" "+empAge);
		
	}
	
	static void orgNameChange() {
		orgAddress=" XYZ ";
	}
	
	public static void main(String[] args) {
		System.out.println(orgAddress); 
		OrgData.orgNameChange();
		System.out.println(orgAddress); 
		OrgData o1 = new OrgData(123, "a", 25);
		OrgData o2 = new OrgData(124, "b", 25);
		OrgData o3 = new OrgData(125, "c", 25);
		
		o1.display();
		o2.display();
		o3.display();
	}
}
