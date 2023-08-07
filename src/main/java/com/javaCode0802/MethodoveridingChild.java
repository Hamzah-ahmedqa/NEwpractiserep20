package com.javaCode0802;


                                  //extends the parent class


public class MethodoveridingChild extends MethodOveriding {
	
	

	public static void main(String[] args) {
		MethodoveridingChild objRef = new MethodoveridingChild();
		//create a object in our method
		objRef.display();
		                                  //create the object of the parent class in this child class
		MethodOveriding objParent = new MethodOveriding();
		objParent.display(); //this will call the parent class method 
		
		objRef.helloWorld(10); //the child class will always call its own first
		
		objRef.secretCode();
		objRef.notSoSecretCode();
		objParent.notSoSecretCode();
		
	//   objParent.secretCode(); cant call this because is is private and belongs to the class

	}
	
	
                          //this has the same name as our method in our Parent class that we extended
	public static void display() {
		System.out.println("Childs class display");
		              //display(); now if we run this it will call this display instead of the parent class
		            //if this didnt exist it would call the parent class
		System.out.println("-----------------------------------------------");
		
		
	}
	public static void helloWorld(int i) {

		System.out.println("This is the code of hello from the Child class");
		System.out.println("-----------------------------------------------");
	}
	private static void secretCode() {
		
		System.out.println("This is the secret code in our child class");
		System.out.println("-----------------------------------------------");
		
	}
	
	protected static void notSoSecretCode() {
		
		System.out.println("not so secret code in childs class");
		System.out.println("-----------------------------------------------");
	}
	
	
}
