package com.javaCode0717;

public class Create_1d_arrrays {

	public static void main(String[] args) {
//      declaration, you cannot give the size during declaration
		int[]a = new int[7]; 
		          //creation 
		System.out.println(a.length);
		
		
		int []r = new int[0];
		System.out.println(r.length);
		
		int[]arr = new int[-2];
	//	System.out.println(arr.length);
		//java.lang.NegativeArraySizeException 

	}

}
