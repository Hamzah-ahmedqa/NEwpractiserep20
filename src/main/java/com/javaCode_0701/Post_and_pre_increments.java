package com.javaCode_0701;

public class Post_and_pre_increments {

	public static void main(String[] args) {
		
		
		int i = 1;
		int j = i++ + ++i;
		int k = j++ + i++ + ++j + j++;
		
		
		System.out.println("This the value of i variable : " +i);
		System.out.println("This the value of j variable : " +j);
		System.out.println("This the value of k variable : " +k);
		
		
		
		

	}

}
