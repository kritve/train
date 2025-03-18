package com.programming.class1;

public class MethodRefEx {

	interface Converter<F,T>{
		T convert (F from);
	}
	
	public static void main(String[] args) {
		
		Converter<String, Integer> intConverter = (from) -> Integer.valueOf(from);
		Integer convertedValue = intConverter.convert("123");
		System.out.println("Integer value " + convertedValue);
		
		Converter<String, Integer> intConvertUsingMethodRef = Integer::valueOf;
		Integer convertedValue2 = intConvertUsingMethodRef.convert("456");
		System.out.println("Integer value using Method ref: " + convertedValue2);
		
		Converter<String, String> strConvertUsingMethodRef = StringOperation::startsWith;
		String Convertedvalue3 = strConvertUsingMethodRef.convert("Method ref");
		System.out.println("String value using ref is: " + Convertedvalue3);
		
		PersonFactory<Person> personFactory = Person:new;
	}
	
	static class StringOperation {
		static String startsWith(String s) {
			return String.valueOf(s.charAt(0));
		}
	}
	
	interface PersonFactory<P extends Person>{
		P create(String firstName , String lastName);
	}
}
 class Person{
	 public String fName;
	 public String lName;
	 public Person() {}
	 public Person(String fName, String lName) {this.fName= fName; this.lName=lName;}
 } 