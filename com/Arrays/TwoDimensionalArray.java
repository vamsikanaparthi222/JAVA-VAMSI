package com.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] number = new int[3][2];
		/*0->row,1->column
		 * number[0][1] = 10; number[1][2] = 10; number[2][4] = 10; number[4][6] = 10;
		 * number[8][7] = 10;
		 */
		number[0][0]=1;
		number[0][1]=2;
		
		number[1][0]=3;
		number[1][1]=4;
		
		number[2][0]=5;
		number[2][1]=6;
		
		
		/*
		 * number[0][1]=2; number[0][2]=3;
		 */
		
		/*
		 * System.out.println(number[1][1]); System.out.println(number[0][0]);
		 */
		
		for(int i=0;i<number.length;i++) {
			int[] singleRow =number[i];
			for(int j=0;j<singleRow.length;j++) {
				System.out.println(singleRow[j]+" ");
				
			}
			System.out.println();
		}
		

	}
}
