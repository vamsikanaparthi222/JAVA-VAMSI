//package com.Backend;

public class Constructor {
	int i;
	String j;
	byte a;
	short b;
	long c;
	float d;
	double e;
	boolean f;
	char g;

	public static void main(String[] args) {
		Constructor constructor = new Constructor(196);
		//class							//method
		System.out.println(constructor.i);
		System.out.println(constructor.j);
		System.out.println(constructor.a);
		System.out.println(constructor.b);
		System.out.println(constructor.c);
		System.out.println(constructor.d);
		System.out.println(constructor.e);
		System.out.println(constructor.f);
		System.out.println(constructor.g);
	}
//		parameterless constructor
		public Constructor() {
			i =222;
		}
		
//		parameter with  constructor
		public Constructor(int a) {
			i = a;
		}
		
		
		
	
}
