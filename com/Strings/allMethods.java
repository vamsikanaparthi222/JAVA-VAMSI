package com.Strings;

import java.util.Arrays;

public class allMethods {

	public static void main(String[] args) {
		String s1=" Hello Daniel How Are You ";
		String s2=" Hello Joesph Good Morning ";
		String s3=" Hello Paul How Are You ";
		String s4="222";
		String s5="";
		
		System.out.println(s1.startsWith("He"));//it shows false why because space is their in starting s1
		System.out.println(s1.endsWith("ou"));//it shows false why because space is their in ending s1
		System.out.println(s1.contains("How"));
		System.out.println(s1.equals("Daniel"));
		System.out.println(s1.equals(" Hello Daniel How Are You "));
		System.out.println(s1.equalsIgnoreCase("Hello Joseph"));
		System.out.println(s1.length());
		System.out.println(s1.trim());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toCharArray());
		System.out.println(s1.indexOf("i"));
		System.out.println(s1.lastIndexOf("u"));
		System.out.println(s1.substring(8));//it starts 8th letter
		System.out.println(Arrays.toString(s1.split("")));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(3));
		System.out.println(s1.replace("H", "W"));
		System.out.println(s1.replaceAll("Daniel", "Bigil"));
		System.out.println(s4.valueOf(s4));
		System.out.println(s1.isEmpty());
		System.out.println(s5.isEmpty());
		System.out.println(s1.isBlank());
		System.out.println(s5.isBlank());
		
				
//				s1.startsWith("He"),
//				s1.endsWith("ou"),
//				s1.contains("How"),
//				s1.equals("Are"),
//				s1.equalsIgnoreCase("Hello Daniel"),
//				s1.length(),
//				s1.trim()
				

	}

}
