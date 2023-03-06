package com.Human;

public class Human {
	//variables :- variables are container to storing the data values
	public String Gender = "Boy"; //String represent string || in double quotations
	public String Color ="White";
	public String Name = "Human";
	public int Height = 170;   //  represents integer(numbers)
	public int Weight = 90;
	public float Grade = 6.8f;  //float represents Fractions
	public char Letter = 'A';    // char represents character of the letter
	public boolean Telling = true;  //boolean represents the true or false
	
	
	static int id= 101;  //static fields
	String name = "King";  //without static is called non-static fields
	
	
	

	public static void main(String[] args) {
		// main() :- main is nothing but a method or function name
		Human human = new Human();
		System.out.println("King is a "+human.Gender);
		System.out.println("King Color is "+human.Color);
		System.out.println("King is a "+human.Name);
		System.out.println("King Height is "+human.Height);
		System.out.println("King Weight is "+human.Weight);
		System.out.println("King achieved grade are "+human.Grade);
		System.out.println("King likes Letter "+human.Letter);
		System.out.println("King says always "+human.Telling);
		//checking sizes of data types
		System.out.println(Byte.SIZE/8);  //Byte is a Wrapper classes
		//Ranges
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		System.out.println(Short.SIZE/8);
		System.out.println(Integer.SIZE/8);
		System.out.println(Long.SIZE/8);
		System.out.println(Float.SIZE/8);
		System.out.println(Double.SIZE/8);
		//System.out.println(boolean.SIZE/8);
		System.out.println(Character.SIZE/8);
		
		//variables
		int pincode; //define
		pincode =500050;  //initialisation
		pincode =500020;  //o/p:500020 because of reassaining
		System.out.println(pincode);
		
		System.out.println(id);
		System.out.println(new Human().name);  //without object error will appear

	}

}
