package com.Strings;

//to derive string in a string are called substring
//it display how much of number to give the substring. it display starts from that character
//it doesn't start "0"
//to give number 2 "Da" is deleted
//it display also with spaces the way of substring

public class substring {

	public static void main(String[] args) {
		String s1="Daniel";
		String s2="Joseph";
		
		System.out.println(s1.substring(1,2));
		System.out.println(s1.substring(2));
		
		System.out.println(s2.substring(1));
		System.out.println(s2.substring(3));

	}

}
