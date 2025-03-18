package com.programming.class1;

public class Customer {
	String fName;
	String lName;
	int age;
	String address;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
		Customer cus = new Customer();
		cus.setfName("ABC");
		cus.setlName("XYZ");
		cus.setAge(25);
		cus.setAddress("Bellandur");
		
		System.out.println("Name: " + cus.getfName() + " " + cus.getlName());
		System.out.println("Age: " + cus.getAge());
		System.out.println("Address: " + cus.getAddress());
	}
}
