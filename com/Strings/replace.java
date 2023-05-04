package com.Strings;

//means it can replace which word you want to replace
public class replace {

	public static void main(String[] args) {
		String s1="Hello Daniel How Are you";
		String s2="Hi john ";
		String s3="hi paul";
		
		System.out.println(s1.replace(s1, s3));
		System.out.println(s1.replace("Daniel", "Dany"));
		System.out.println(s2.replace("Hi", "Hello"));
		System.out.println(s3.replace("Jhon", "Paul"));
		

	}

}
