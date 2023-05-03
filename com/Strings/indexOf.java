package com.Strings;

//to find what is the position of characters in a letter
//indexOf methode starts with "0"
public class indexOf {

	public static void main(String[] args) {
		String s1="Daniel";
		String s2="Da niel";
		System.out.println(s1.indexOf("n"));
		System.out.println(s2.indexOf("n"));
		
		//in case v is not their in a Daniel it goes to -1(negative one)
		//it doesn't retuen "0"(Zero)
		System.out.println(s1.indexOf("v"));
		System.out.println(s1.indexOf(10));

	}

}
