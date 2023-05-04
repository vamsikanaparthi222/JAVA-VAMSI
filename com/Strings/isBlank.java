package com.Strings;

//it means any spaces is their in the string it does not counted or accepted 
//the string is blank it returns True
//the String is their with names or characters it returns False
public class isBlank {

	public static void main(String[] args) {
		String s1="";
		String s2="  ";
		String s3="Hello";
		
		System.out.println(s1.isBlank());
		System.out.println(s2.isBlank());
		System.out.println(s3.isBlank());

	}

}
