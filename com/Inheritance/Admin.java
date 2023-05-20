package com.Inheritance;

//highest level

//Admit can also read , write and manage the products like adding new products and deleting etc..
public class Admin extends Developer {
	
//	public void read() {
//		System.out.println("Read Code");
//	}
//	
//	public void write() {
//		System.out.println("Write Code");
//	}
	
	//Adding or deleting products or applications
	public void manage() {
		super.read();
		System.out.println("Manage Code");
	}
	
	
	//below read methode taking inside of Admin block
	//it doesn't take guest read
	//that issue to rectify using Super keyword
	public void read() {
		System.out.println("Admin read code");
	}
}
