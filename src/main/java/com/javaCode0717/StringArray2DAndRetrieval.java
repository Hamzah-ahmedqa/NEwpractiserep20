package com.javaCode0717;

public class StringArray2DAndRetrieval {

	public static void main(String[] args) {
		
		
	String[][]sArr = {{"Baba","Momma","Humza","Muhammed"},{"Siraj","Hizqeel","Anika","Haniyah"}};
		
		for (int i = 0; i<sArr.length; i++) {
			
			for(int j = 0; j<sArr[i].length;j++) {
				
				System.out.print(sArr[i][j]+" "+"|");
			}
			       System.out.println();
		}
		 
		System.out.println("--------------------------------------------------------------------");
		
		String[][] S1 = new String[2][3];
		
		
		S1[0][0] = "Hello World";
		S1[0][1] = "Hello Humza";
		S1[0][2] = "Hello Bob";
	                           	S1[1][0] = "Hey Universe";
	                         	S1[1][1] = "Hey Steve";
		                        S1[1][2] = "Hi Carl";
		
		                        
		          for(int i = 0; i<S1.length ; i++ ) {
		        	  
		        	  for (int j  = 0 ; j<S1[i].length; j++) {
		        		  
		        		  System.out.print(S1[i][j]+" "+"|");
		        	  }
		        	  System.out.println();
		          }
		                       

	}

}
