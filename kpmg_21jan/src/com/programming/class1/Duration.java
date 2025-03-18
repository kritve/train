package com.programming.class1;

public class Duration {
	
	long startV, endV;
	
	public Duration(long startV, long endV) {
		if(startV>endV) {
			throw new IllegalArgumentException("Start cannot be greater than end");
		}
		
		this.endV=endV;
		this.startV=startV;
	}
	
	public static void main(String[] args) {
		Duration obj = new Duration(23, 0);

	}

}
