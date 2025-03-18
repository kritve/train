package com.programming.class1;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
	String str = "ABC";
	Scanner sc = new Scanner(str);
	System.out.println("Result "+sc.hasNext());
	
	System.out.println("String "+ sc.nextLine());
	sc.close();
	Scanner in = new Scanner(System.in);
	System.out.println("ENter name ");
	String name = in.next();
	System.out.println("Name "+name);
	System.out.println("enter age ");
	int age = in.nextInt();
	System.out.println("age:"+age);
	System.out.println("Result "+in.hasNext());
	in.close();
	
}
	
}
