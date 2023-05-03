package com.Strings;

//contains:-it means verify letter middle or center or any position  word is matching or not in our word

public class contains {

	public static void main(String[] args) {
		String s1="daNiel";
		String s2="daniel";
		String s3="DANIEL";
		
		System.out.println(s1.contains("Ni"));
		System.out.println(s2.contains("ni"));
		System.out.println(s3.contains("NI"));
		
		System.out.println(s1.contains("Ni"));
		System.out.println(s2.contains("ni"));
		System.out.println(s3.contains("NI"));
		
		System.out.println(s1.contains("Ni"));
		System.out.println(s2.contains("ni"));
		System.out.println(s3.contains("NI"));
		
		System.out.println(s1.contains("hello"));
		System.out.println(s2.contains("jos"));
		System.out.println(s3.contains("dany"));
		//above three gives false because it does not contains in s1,s2,s3 words

	}

}
