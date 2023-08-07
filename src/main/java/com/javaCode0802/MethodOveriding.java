package com.javaCode0802;

public class MethodOveriding {

	// this will be the parent class

	public static void display() {

		System.out.println("This is the display class found in the parent class of MethodOveriding");
		System.out.println("-----------------------------------------------");
	}

	public static void helloWorld(int i) {

		System.out.println("This is the code of hello from the parent class");
		System.out.println("-----------------------------------------------");
		
		// the parent class should have a lower accessibility than the child class or equal to its child class
		//the parent class should never have a higher access modifer, the child class should
		// public is greater than > default is greater than > protected and > private
	}
private static void secretCode() {
	
	System.out.println("This is the secret code in our parent class");
	System.out.println("-----------------------------------------------");	
		
	}
protected static void notSoSecretCode() {
	
	System.out.println("not so secret code in parents class");
	System.out.println("-----------------------------------------------");
}

}
