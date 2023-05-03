package com.Strings;


//equalsIgnoreCase:-
//->means it doesn't compare case, but it only compares data
//->if the word is uppercase and lowercase it's not the matter of equalsIgnoreCase
//->only it converts upper and lower case to lower case letters only
public class equalsIgnoreCase {

	public static void main(String[] args) {
		String s1="Paul";
		String s2="paul";
		String s3="PAUL";
		
		System.out.println(s1.equalsIgnoreCase("Pauls"));
		System.out.println(s2.equalsIgnoreCase("Paul"));
		System.out.println(s3.equalsIgnoreCase("Paul"));
		
		System.out.println(s1.equalsIgnoreCase("Paul"));
		System.out.println(s2.equalsIgnoreCase("Paul"));
		System.out.println(s3.equalsIgnoreCase("Paul"));
		
		System.out.println(s1.equalsIgnoreCase("Paul"));
		System.out.println(s2.equalsIgnoreCase("Paul"));
		System.out.println(s3.equalsIgnoreCase("Paul"));
		
//true because of s1,s2,s3 all letters are converted into lowercase
//false because the letter pauls is not in the s1,s2,s3 so thats why it goes false 
	}

}
