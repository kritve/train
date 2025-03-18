package com.programming.class1;

class Parent {
	int data = 10;

	void display() {
		System.out.println("Parent class Method");
		System.out.println("data= " + data);
	}

	void show() {
		System.out.println("Parent CLass Method");
	}

}

public class UnderstandInheritance extends Parent {

	int data = 20;

	@Override
	void display() {
		System.out.println("Child class method");
		System.out.println("data= " + data);
	}

	void message() {
		System.out.println("Child method");
	}

	public static void main(String[] args) {

		Parent obj = new Parent();
		//System.out.println("data= " + obj.data);
		obj.display();

		UnderstandInheritance obj2 = new UnderstandInheritance();
		//System.out.println("data= " + obj2.data);
		obj2.display();

		Parent obj3 = new UnderstandInheritance();
		//System.out.println("data= " + obj3.data);
		obj3.display();

	}

}
