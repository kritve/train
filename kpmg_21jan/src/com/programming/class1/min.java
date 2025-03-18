package com.programming.class1;

public class min {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		minval(arr);
	}
	
	static void minval(int[] arr) {
		int s=arr[0];
		for(int i: arr) {
			if (i<s) {
				s=i;
			}
		}
		System.out.println(s);
	}
}
