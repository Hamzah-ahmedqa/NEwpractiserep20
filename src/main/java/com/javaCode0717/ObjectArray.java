package com.javaCode0717;

public class ObjectArray {

	public static void main(String[] args) {
	
		
		//object class is the parent class of all classes in java
		
		                         //this can hold int,string,double,and char value types
		Object[][]ObjArray = {{"java",12,'#',100,10,"Wow so cool",'&',10.5,"selenium",true,20.3f}};
		
		
     for(int i = 0; i<ObjArray.length ; i++) {
    	 
    	 for (int j = 0; j<ObjArray[i].length ; j++ ) {
    		 
    		 System.out.print(ObjArray[i][j]+" ");
    		 
    	 }
     }

		
		
		
		
		
		
		

	}

}
