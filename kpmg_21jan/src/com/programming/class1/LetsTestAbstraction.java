package com.programming.class1;

abstract class Shape {
	abstract void draw();
	double area;
	void calculateArea() {
		System.out.println("Area : "+ area);
		System.out.println();
	}
}

class Rect extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing Rectangle");
		double b=20,h=30;
		area=b*h;
		calculateArea();
	}
}





public class LetsTestAbstraction {
	
	public static void main(String[] args) {
		Rect obj = new Rect();
		obj.draw();
		
	}

}
