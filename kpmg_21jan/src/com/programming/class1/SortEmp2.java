package com.programming.class1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEmp2 {

	public static void main(String[] args) {
		Employee2[] e = new Employee2[4];
		e[0] = new Employee2(0, null, 0, null, null, null, 0, 0);
		e[1] = new Employee2(1, null, 0, null, null, null, 0, 0);
		e[2]= new Employee2(2, null, 0, null, null, null, 0, 0);
		e[3]= new Employee2(3, null, 0, null, null, null, 0, 0);
		
		Arrays.sort(e);
		System.out.println(Arrays.toString(e));
		
		int[] intArr = {4,5,6,2,3,12,321};
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		String[] stArr = {"ds","af","as","d"};
		Arrays.sort(stArr);
		System.out.println(Arrays.toString(stArr));
		
		List<String> liststr = new ArrayList<>();
		liststr.add("A");liststr.add("b");
		liststr.add("dc");liststr.add("q");
		Collections.sort(liststr);
		System.out.println(liststr.toString());
	}
	
	
}
