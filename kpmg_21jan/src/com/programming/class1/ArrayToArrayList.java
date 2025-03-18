package com.programming.class1;

import java.util.*;

public class ArrayToArrayList {
	
	public static void main(String[] args) {
		Integer[] arr1 = {1,2,3,4};
		LinkedList<Integer> arr2 = new LinkedList<>(Arrays.asList(arr1));
		arr2.add(47478494);
		Iterator<Integer> it =arr2.iterator();
		while(it.hasNext()) {
			Integer b=it.next();
			System.out.println(b);
		}
		
	}
	
}
