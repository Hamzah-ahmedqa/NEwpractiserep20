package com.javaCode0719;

public class Variable_IN_JAva {

	/*
	  
	 1) Instance variables 
	 2) Static Variables
	 3) Local variables
	 
	 //global variable is a class variable in java
	  * 
	  * a class variable is defined under the class but not in any method
	  * only class variables van be static or non static 
	 
	 */
	String name;          // instance variable 
	int age;              // instance variable
	double balance;      //instance variable
	static int wheels = 4; //static variable
	//these are class variables
	//technically because they dont have static keyword they are instance variables 
	static Variable_IN_JAva vij = new Variable_IN_JAva();
	public static void main(String[] args) {
	
		
		
		vij.age = 90;
		System.out.println(vij.age+30);
		

	}
	
	public static void SAmple() {
		
		
	}
	
	
	public void main() {
		
		age = 20;
		System.out.println(age+15);
		
		int age = 40; //local variables are only local, they are neither static nor non-static
		              // you cannot create a static variable in a method, 
		              //even if the method is static the variable cannot be static it is only local
		             // if you try to declare a static method in a variable it will throw an error
		             //^ telling you to remove the invalid modifiers 
	}


	
}
