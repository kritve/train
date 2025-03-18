package com.programming.class1;

public class SelectionStatement {

	public static void main(String[] args) {
		int number = 13;
		char grade='A';
		int j=0;

		/*
		 * if (number % 2 == 0) System.out.print("even"); else {
		 * System.out.print("odd"); }
		 */

		switch (grade) {
		case 'A':
			System.out.println("Good");
			break;
		case 'B':
			System.out.println("Okay");
			break;
		case 'C':
			System.out.println("Pass");
			break;
		case 'D':
			System.out.println("Fail");
			break;
		default:
			System.out.println("N/A");
			break;
		}
		
		
		
		for(int i=0; i<=3; i++) {
			for(j=0; j<=3; j++) {
				if(i==2 && j==2) {
					continue;
				}
				System.out.println(i+" "+j);
			}
			
		}
		
		
	}

}
