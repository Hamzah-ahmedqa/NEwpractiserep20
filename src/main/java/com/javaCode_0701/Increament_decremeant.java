package com.javaCode_0701;

public class Increament_decremeant {

	public static void main(String[] args) {
		
		int i =1;
		System.out.println(i); // this should be 1
		i++; 
		System.out.println(i); // this should be 2
		i++;
		System.out.println(i); //this should be 3 
		
		int j = i++;
		System.out.println(i); //this should be 4
		System.out.println(j); // this should be 4
		j = i++ + i++;
		System.out.println(j); //should be 10
		System.out.println(i); //should be 6

		//runprogram to understand i was wrong
	}

}
