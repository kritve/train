package com.programming.class1;

import java.util.Arrays;

public class ArraysCreation {
	
	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		String[] starr = {"a","b","c"};
		
		for(String s: starr) {
			System.out.println(s);
		}
		
		System.out.println(Arrays.toString(starr));
		
	}

}
