package com.javaCode_0703;

public class MoreAboutMainMethod {

	static MoreAboutMainMethod mamm = new MoreAboutMainMethod();
	
	//why is main method always public?
	// the main method is always public because it needs to be accessed throughout the project
	//each class in each package will not have a main method because it will be a sloppy way of writing code
	//other classes will need access to it 
	//if it has restriction how will it do justice to the whole project
	//technically one package will 
	//have one class with the main method that each class can access to express their logic or code
	
	
	//if you swap the keywords like this 
	//static public void main(String[]args){}
	//it will not throw an error,  it will still execute
	
	// however if you switch the void keyword with the two keywords before it will throw an error because 
	//it is a return type
	
	//you cannot change the name from main to anything else, it will throw an error
	
	public static void main(String[] args) {
	//the epitome of execution, 
		
		Temp();
		//this can be called directly because it is static
		
		mamm.Archetype();
// this object was made to call the non static method

	}
	
	public static void Temp() {
		
		System.out.println("Temp method");
	}
	
	public void Archetype() {
		System.out.println("Archetype Method");
	}
	
	
	//public static void main(String args[] ) this will work
	// public static void main(String... args ) this will also work
	//the args can be changed 
	
		//public static void main(String[] humza) 
	//this will work
	
	
	//public static void main(String[]) this will not work
	
	
	

}
