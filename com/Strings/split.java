package com.Strings;

//it display names in different position in Array
import java.util.Arrays;

public class split {

	public static void main(String[] args) {
		String s1="Daniel^Dany Joseph paul";//[Daniel,Joseph,paul]
		
		System.out.println(Arrays.toString(s1.split(" ")));
		
		System.out.println(Arrays.toString(s1.split("^")));

	}

}
