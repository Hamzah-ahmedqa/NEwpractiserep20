package com.javaCode0717;

public class Retrival2DArrays {

	public static void main(String[] args) {
		
		int[][]a = {{10,20,30,40},{11,21,31,41},{12,22,33,44}};
		
		
		for (int i=0; i <a.length ; i++) { //do not put <=
	
          		
		for(int j =0; j<a[i].length; j++) { //do not put <=
			
			System.out.print(a[i][j]+" ");
			
		                       }
		                         System.out.println();
                                                 	}
		
		
		System.out.println(a);
		
		System.out.println(a[0]);
		System.out.println(a[0][0]);
        System.out.println(a[2][2]);
        
        System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(a[2].length);

	}

}
