package com.Arrays;

public class Strings {

	public static void main(String[] args) {
		// String=>it is used to store sequence of characters in Text format
		//String is a class in java
		//String is also a dataType but it is not a primitive Type
		//2 different ways
		//1.String s1 ="hello"
		//2.String s1 = new String("hello")
		
		String name="Daniel";
		String emailId=".com";
		//System.out.println(name);
		//System.out.println(emailId);
		
		//in case i want adding 2 string called as concadination
		System.out.println(name+emailId);
		
		String s1=new String("hello");
		System.out.println(s1+name+emailId);

	}

}
