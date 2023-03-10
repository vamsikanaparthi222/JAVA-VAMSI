package com.Backend;

import java.util.Scanner;

public class compareTwoStrings {

	public static void main(String[] args) {
		String s1,s2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The First String");
		s1 =scanner.nextLine();
		
		System.out.println("Enter The Second String");
		s2 = scanner.nextLine();
		
		if(s1.compareTo(s2)>0) {
			System.out.println("First String Is Greater Than Second");
		}
		else if(s1.compareTo(s2)<0){
			System.out.println("First String is smaller than second");
		}
		else {
			System.out.println("Both Strings Are Equal");
		}
		
		scanner.close();

	}

}
