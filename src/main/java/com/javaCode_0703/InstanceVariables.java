package com.javaCode_0703;

public class InstanceVariables {
    
	//if i declare static infront of this variable it will be become a static variable 
	//but for now its an instance variable
	//also could be known as global
	String TVBrand = "Samsung";
	int lenght = 40;
	int width = 40;
	int price= 8000;
	int i = 300;
	//there are two variables of i with different values, but they are declared differently
	
	public static void main(String[] args) {
	
		//3 type of variables 
		/* 1)instance variable -> declared at a class level
		 * 2)static variable -> declared at a class level but it is static
		 * 3)local variable -> this is declared at a method level it is neither static nor non static
		 * 
		 */
		
          //i is the variable that has an assigned value of 87
		int i = 87;
		
	//regardless if the method is static or not the variables declared inside of it are still local variables
	
		
	}	
	public void SamepleMethod() {
		
		
	}

	
	
	
}
