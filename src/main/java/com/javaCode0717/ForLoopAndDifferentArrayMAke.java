package com.javaCode0717;

public class ForLoopAndDifferentArrayMAke {

	public static void main(String[] args) {
		// this does declaration, creation, and initialization 
				int[]x = {10,20,30,40,50,60,};
			//both of these will work	
				int[]t = new int[] {101,102,103,104,105,106};
				
				String[] S = {"java","pyhton",".net","c","C++","Cypress","Cobol","JavaScript"};
				
				for(int f = 0; f<=t.length; f++) {
					
					System.out.print(f+" ");
				}
			     System.out.println();
			     
			     System.out.println("This is the 6th position of the index " +t[5]);
				

	}

}
