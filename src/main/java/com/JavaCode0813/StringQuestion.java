package com.JavaCode0813;

public class StringQuestion {

	public static void main(String[] args) {
	//in our automation framework we create a lot of string objects
		
		//which way will you write your string object?
		 
		String s1 = new String("Hello");
		//2 objects will be created 1 in heap memory and one in slp, 
		//there is more memory occupation when using this way to create string kewwords
		//more memory taken, more load on java taking time to execute projects
		
		
	//we will choose the second option because it will take up too much memory if we use the first,
		//every time we declare a new string
	
		
		String s2 = "Hello";
	//1 object will be created in slp area

		//DELETING STRING OBJECTS WILL NOT BE PART OF GARBAGE COLLECTION
		
	}

}
