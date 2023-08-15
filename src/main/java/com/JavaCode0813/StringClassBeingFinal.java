package com.JavaCode0813;

         //if this becomes final no other classes can extend a final class
public /*final*/ class StringClassBeingFinal {
//final is a keyword n java which is used with/for 
	//classes, methods, and variables
	//anything that is final cannot be changed, it is final hence the name
	
	//String as a class is final in nature
	
	public final String s1 = "Hello World";
	
	public String s2 = "Hello Friends";
	
	public static void main(String[] args) { 
		
		 int i =10; //10
		 i = i+2; //12
		 System.out.println(i); //the value is obviously 12, i can be changed
		 
		final int j = 5;
		 //final keyword makes it unchangeable
	//	j = j +10; this will throw an error because it is final, 
		
		 
		 

	}               /*final void show() {
		
	                                      }*/
	
	
} class Test extends StringClassBeingFinal{
	
	//if you make a method final it cannot be overrided in the parent class
	void show() {
		//cannot override a method that is final in parent class, the point is to implement certain changes 
		//but if the thing is final then there is no purpose
		//a child class cannot extend a final class
		
		//String class because String class has features which is not available to other classes in java
		//this prevent sub-classes to try and implement changes to the string class
		//hence anything within the string class cannot be modified 
		
		//String immutability is different from final concept
		//String immutability is related to string objects 
		//string final concept is related to String class
		
		
	} 
	
	

}
