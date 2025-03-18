package com.programming.class1;

public class InterfaceEx implements example{

	@Override
	public void p1() {
		// TODO Auto-generated method stub
		System.out.println("p1");
	}

	@Override
	public void p2() {
		// TODO Auto-generated method stub
		System.out.println("p2");
	}
	
	public static void main(String[] args) {
		InterfaceEx obj = new InterfaceEx();
		obj.p1();
		obj.p2();
		
	}

}
