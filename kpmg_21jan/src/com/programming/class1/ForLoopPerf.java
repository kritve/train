package com.programming.class1;

import java.util.*;

public class ForLoopPerf {
	
	static List<Integer> list = new ArrayList<>();
	static long startT, endT;

	
	static {
		for(int i=0; i<=10_000_000;i++) {
			list.add(i);
		}
	}
	
	public static void main(String[] args) {
		startT = Calendar.getInstance().getTimeInMillis();
		for(Integer i : list) {}
		endT = Calendar.getInstance().getTimeInMillis();
		System.out.println("For each loop took " + (endT - startT) + "ms");
		
		startT = Calendar.getInstance().getTimeInMillis();
		for(int i=0; i<list.size(); i++) {}
		endT = Calendar.getInstance().getTimeInMillis();
		System.out.println("For each loop took " + (endT - startT) + "ms");
		
		startT = Calendar.getInstance().getTimeInMillis();
		int size=list.size();
		for(int i=0; i<size; i++) {}
		endT = Calendar.getInstance().getTimeInMillis();
		System.out.println("For each loop took " + (endT - startT) + "ms");
		
		startT = Calendar.getInstance().getTimeInMillis();
		for(int i=size; i>0; i--) {}
		endT = Calendar.getInstance().getTimeInMillis();
		System.out.println("For each loop took " + (endT - startT) + "ms");
		
		
	}

}
