package com.Backend;

public class Foreach {

	public static void main(String[] args) {
		//looping statements=>to excute a piece of code in multiple times based on some conditions that time is used
		
		// foreach=> for each only used arrays and collections
		
		//example forloop
//		int[] arr= {1,2,3,4,5,6,7,8,9};
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
		
//		}
//		using foreach type
				int[] arr= {1,2,3,4,5,6,7,8,9};
				for(int value:arr) {
					System.out.println(value);
				}
		/*
		 * string arr = "ayhkelA","ismav"; for(value:arr) { System.out.println(value); }
		 */
	}

}
