package com.programming.class1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HowStreamsWork {
	
	public static void main(String[] args) {
		
	

	List<String> countries = new ArrayList<>();
	countries.add("India");countries.add("Aus");
	countries.add("Eng");
	countries.add("SA");
	
	Collections.sort(countries);
	for(String c: countries) {
		c=c.toUpperCase();
		if(!c.startsWith("E")) {
			System.out.println(c);
		}
	}
	
	countries.stream().map(s->s.toUpperCase()).filter(s->s.startsWith("E")).sorted().forEach(s->System.out.println(s));
	
	Stream<String> fruitStream = Stream.of("apple", "papya", "jackfruit", "dragon fruit");
		
	//System.out.println("Fruit Stream: " + fruitStream.collect(Collectors.toList()));
	
	Predicate<String> noFruitWordFilter = name -> !name.contains("fruit");
	
	List<String> filteredStream = fruitStream.filter(noFruitWordFilter).collect(Collectors.toList());
	
	System.out.println(filteredStream);
	
	List<String> slist = new ArrayList<>();
	slist.add("A");
	slist.add("G");
	slist.add("C");
	slist.add("D");
	
	slist.stream().sorted().forEach(s->System.out.println(s));
	System.out.println(slist);
	
	}
}
