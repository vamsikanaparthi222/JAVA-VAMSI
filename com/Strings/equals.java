package com.Strings;


//equals :-
//->it means complete comparsion
//->it compare exactly word
//->only if word is matching it goes True otherwise false
public class equals {

	public static void main(String[] args) {
		String s1="Joseph";
		String s2="joseph";
		String s3="JOSEPH";
		
		System.out.println(s1.equals("Joseph"));
		System.out.println(s2.equals("jo"));
		System.out.println(s3.equals("JO"));
		
		System.out.println(s1.equals("Jo"));
		System.out.println(s2.equals("jo"));
		System.out.println(s3.equals("JO"));
		
		System.out.println(s1.equals("Jo"));
		System.out.println(s2.equals("jo"));
		System.out.println(s3.equals("JO"));
		
		
		System.out.println(s1.equals(s1));
		System.out.println(s2.equals(s1));
		System.out.println(s3.equals(s1));
		

	}

}
