package com.JavaCode0813;

public class MoreAboutStrings {

	public static void main(String[] args) {
		
	String s1 = new String();
		//only one object is created because there is no literal pass inside the constructor
	
	
          //s2 will be able to refer to our object inside the 	
	String s2 = new String("Selenium");
	//two objects will be created, one in heap memory and one in SCP or SLP
		
	//our internal jvm reference will allow us to call the objects inside the scp or sp
	
	//no other class inside java can directly declare it like strings
	
	String s3 = "Hello";
	//one object created in slp not in heap memory
	
	String s4 = "Hello";
	//no object created because this object already exist in SLP the 
	//s4 will just pint to the object previously created 
	
	
	
	
	
	}

}
