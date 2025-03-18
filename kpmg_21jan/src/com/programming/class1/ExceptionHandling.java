package com.programming.class1;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		int n=0;
		
		int intArr[]= {1,2,3};
		
		try {
			n=50/0;
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(n);
	
		try {
			for(int i=0; i<=intArr.length;i++) {
				System.out.println(intArr[i]);
			}}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	

}
