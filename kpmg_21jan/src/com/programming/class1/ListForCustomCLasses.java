package com.programming.class1;

import java.util.*;

public class ListForCustomCLasses {

	public static void main(String[] args) {
		List<Book> ListB = new ArrayList<>();
		Book b1 = new Book(123, "a", "b", "c" ,1000);
		Book b2 = new Book(124, "q", "b", "c" ,100);
		Book b3 = new Book(125, "z", "b", "c" ,1);
		
		ListB.add(b1);
		ListB.add(b2);
		ListB.add(b3);
		ListB.add(b1);
		
		Iterator<Book> it =ListB.iterator();
		while(it.hasNext()) {
			Book b=it.next();
			System.out.println(b.bookName);
		}
		
	}
}
