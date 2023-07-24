package com.javaCode0717;

public class CreationOF2DArrays {

	public static void main(String[] args) {
	
		
		int[][] arr =new int [4][12];
	             	
		//both top and bottom are valid 
		
		int[][]a;
		           //2 is rows 
		a= new int[2][3];    
		              //3 is columns
		
		
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		                //assigning the values or initializing them
		a[1][0]=4;
		a[2][1]=5;
		a[3][2]=6;
		
		
		
		int[][]ar = new int[][] {{1,2,3},{23,21,22}}; //this is the same as above
		
		int[][]ar1 = {{1,2,3,4,5},{6,7,8,9,10}};  //this is valid as well

		String[][] credentials = {{"username","password","secretCode"},
				                   {"username1","password1","secretCode1"}};
		//2 dimensional String arrayS
				
		
		
		

	}

}
