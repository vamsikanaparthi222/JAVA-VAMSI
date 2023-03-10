package com.Backend;

public class Objects {
	public Objects(){
		
	}
	public Objects(int a){
		
	}

	public static void main(String[] args) {
		//to create n' number of times of objects
		Objects object1 = new Objects();
		Objects object2 = new Objects(196);
		Objects object3 = new Objects(222);
		System.out.println(object1.hashCode());
		System.out.println(object2.hashCode());
		System.out.println(object3.hashCode());
		

	}

}
