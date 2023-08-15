package com.javaCode_0715;

public class PatterensWithNestedForLoops {

	public static void main(String[] args) {
		
 //           cols
		/*   *****
		     *****
		     ***** rows
		     *****
		     *****
		how can we make this pattern ?
		we have 5 rows and cols so we can use that knowledge 
		
		
		                          */
		
		//rows
		for(int i =1 ; i<=5; i++) {
			
			//cols
			for (int j=1; j<=5; j++) {
				System.out.print(" * ");
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
