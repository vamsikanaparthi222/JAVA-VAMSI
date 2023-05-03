package com.Strings;

//trim:- it means if any spaces in a letter starting(leading) and ending(trailing) it goes to deleted
//it doesn't delete middle or center spaces
public class trim {

	public static void main(String[] args) {
		String s1=" Hello Daniel  ";
		
		System.out.println(s1.trim());
		
		System.out.println(s1.trim().length());
		
		System.out.println(s1.length());
//to find the length it goes 15 charcters in s1 . but output display only 12 characters
		
	}

}
