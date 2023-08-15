package com.JavaCode0813;


  //if i named this class String it will throw an error, but it can be Strings
public class Strings {

	//what is the parent class of all the classes in java?
	//it is OBJECT -object class is the parent of all classes in java 
	// but they say String is the king of all classes in java
	//String is a non primitive data type
	//String is the only data type that acts as a Class and an Object
	//be default String is final
	
	//String is also called a sequence of characters
	
	
	//string is a class
	//string objects can be directly created 
	
	//StringBuffer StringBuilder
	
	public static void main(String[] args) {
		

		char c[] = {'s','e','l','e','n','i','u','m'};
		
		String s1 = new String(c); //this will make the entire Character array concatenate 
		
		
	
		System.out.println(s1); 
		
		char c1 = '@'; //cannot allow more than one entity 
		String s2 = "@";
		
		for (int i = 0; i <c.length; i ++) {
			 // System.out.println("the current character of c is :" +c[i]);
			System.out.print(c[i]);
		}
		
	}

}
