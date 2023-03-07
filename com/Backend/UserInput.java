package com.Backend;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		//Scanner :- to get user input from console
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hi");
		String Wish = scanner.nextLine();
		
		System.out.println("What Is Your Name ? ");
		String name = scanner.nextLine();
		
		System.out.printf("Hey %s , How Are You? \n",name);
		String Status = scanner.nextLine();
		
		System.out.println("What is Your Age?");
		int age = scanner.nextInt();
		
		System.out.println("What is Your Birth Date");
		byte dob = scanner.nextByte();
		
		System.out.println("What is Your Luckey Number");
		int LuckeyNO =scanner.nextInt();
		
		System.out.println("What is Your Favourite Roll No");
		short no = scanner.nextShort();
		
		System.out.println("Please Enter Your Number");
		long Mobile =scanner.nextLong();
		
		System.out.println("What Is Your SSC Grade Points");
		float Grade = scanner.nextFloat();
		
		System.out.println("What Is Your Graduation Percentage");
		double Percentage = scanner.nextDouble();
		
		System.out.println("You Have A Girl/Boy friend? true or false");
		boolean Friend = scanner.nextBoolean();
		
		System.out.println("What Is Mobile Number of Your Girl/Boy Friend");
		long Letter = scanner.nextLong();
		
		System.out.println("I Hope You Have A Good Wife/Husband in our Next Meeting");
		String Hope = scanner.nextLine();
		
		System.out.println("Thank You For The Information");
		
		scanner.close();

	}

}
