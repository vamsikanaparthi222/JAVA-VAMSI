package com.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] number = new int[2][2];
		/*0->row,1->column
		 * number[0][1] = 10; number[1][2] = 10; number[2][4] = 10; number[4][6] = 10;
		 * number[8][7] = 10;
		 */
		number[0][0]=1;
		number[0][1]=2;
		
		number[1][0]=3;
		number[1][1]=4;
		
		/*
		 * number[0][1]=2; number[0][2]=3;
		 */
		
		System.out.println(number[1][1]);
		System.out.println(number[0][0]);
		

	}
}
