package com.Strings;

//String:to store sequence of characters
//String is also a data type but it's not a primitive type
//String pool :it is nothing but Storage area in java heap where litersls stores
//heap memory:the area of memory used to store objcts instantiated by application running on the JVM

//String Methods:-
//1.startsWith
//2.endsWith
//3.contains
//4.equals
//equalsIgnoreCase

/// 1.startsWith
//it means verify a letter starts with same letter or not in our word
//the letter is matched it goes to true

public class String_Methods {
	public static void main(String[] args) {
		String s1="Hello";
		String s2="hello";
		String s3="HELLO";
		
		System.out.println(s1.startsWith("He"));
		System.out.println(s1.startsWith("he"));
		System.out.println(s2.startsWith("HE"));
		
		System.out.println(s2.startsWith("He"));
		System.out.println(s2.startsWith("he"));
		System.out.println(s2.startsWith("HE"));
		
		System.out.println(s3.startsWith("He"));
		System.out.println(s3.startsWith("he"));
		System.out.println(s3.startsWith("HE"));
				
	}

}

//This is also called as a startsWith example