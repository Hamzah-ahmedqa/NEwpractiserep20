package com.javaCode_0715;

public class Pattern4 {

	public static void main(String[] args) {
		
		/*
		 
		*
		* *
		* * *
		* * * *
		* * * * *
		* * * *
		* * *
		* * 
		*
		 make this pattern
		*/
		
  for (int i =1 ; i<=5; i++) {
	  
	  for (int j = 1; j<=i; j++) {
		  System.out.print("* ");
		 
	  }
	  System.out.println();
  }
	 
  for(int i =2; i<=5 ; i++) {
	  
	  for(int j =5; j>=i ; j--) {
		  System.out.print("* ");
		  
	  }
	  System.out.println();
  }
		
  
  
  
  
	}

}
