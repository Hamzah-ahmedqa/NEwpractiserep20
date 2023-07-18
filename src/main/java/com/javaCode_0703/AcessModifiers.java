package com.javaCode_0703;

public class AcessModifiers {
	
static AcessModifiers am = new AcessModifiers();
//can use this to call non static methods inside the main method
	public static void main(String[] args) {
		//The four access modifiers in classes 
		/*
		 * public - can be used anywhere in the project -> all packages and class
		 * 
		 * protected - within the package, and only outside the package through a child class
		 * 
		 * private - strictly within the same class, cannot be accessed anywheere from the outside
		 * 
		 * default - only within the package, by default if you do not declare an access modifier 
		 * it will automatically become default, but you cannot use the keyword to declare anything as default
		 * just leave it blank
		 * default keyword can only be specified inside of an interface
		 * 
		 */
		
		am.defaultData();
        am.publicData();
        am.privateData();
        am.protectedData();
        publicData();
		
	}
	
	public static void publicData() {
		
		System.out.println("this is the public method ");
	}
	
	protected static void protectedData() {
		
		System.out.println("this is the protected method ");
		
	}
	
	private static void privateData() {
		System.out.println("this is the private method ");
		
	}
	
	static void defaultData() {
		System.out.println("this is the default method ");
		
	}
	

}
