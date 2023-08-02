package com.javaCode0801;

public class Child extends Parent {
                   //have to use this word to inherit its properties 
	
	static Child gimmie = new Child();
	
	public static void main(String[]args) {
		
		gimmie.ParentsBankAccount();
		gimmie.ParentsHouse();
		//these were inherited using the extends keywork 
		
	}
	public void bike() {
		
		System.out.println("This is the bike for child class");
	}
	
	public void SportsCar() {
		
		System.out.println("vroom, this is the childs class sport car");
	}
	
	
}
