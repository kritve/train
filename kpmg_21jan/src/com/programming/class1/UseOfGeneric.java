package com.programming.class1;

import java.util.*;

public class UseOfGeneric {
	
	public static void main(String[] args) {
		
		/*
		 * List<String> lis = new ArrayList<>(); lis.add("a");
		 * 
		 * for(String i: lis) { System.out.println(i); }
		 */
		
		Integer[] inta = {1,2,3,4};
		Character[] chara= {'a','b','s','d'};
		
		printArray(inta);
		printArray(chara);
		
		
	}
	
	static <E> void printArray(E arr[]) {
		for(E ele: arr) {
			System.out.println(ele);
		}
	}

}
