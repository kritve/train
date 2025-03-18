package com.programming.class1;

class Parents {

	int value=10;
	void display() {
		System.out.println("Parent method");
	}
}

public class ThisAndSuper extends Parent{
	int value = 20;
	
	@Override
	void display() {
		System.out.println("Child Method");
	}
	
	void output() {
		System.out.println("Local class "+ this.value);
		System.out.println("Parent class" + super.value);
		this.display();
		super.display();
	}
}