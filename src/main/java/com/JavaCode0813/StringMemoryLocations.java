package com.JavaCode0813;

public class StringMemoryLocations {
	
	
	/* There are 5 MEMORY TYPES 
	 
	    
	 1) Heap memory   - string are always stored here 
	 there are two extra types of heap memory which are 
	 a)String constant pool (scp)
	 b)String Literal pool (slp) these are both apart of heap memory
	 
	 
	 2)Stack Memory
	 3) Pc registry 
	 4) Method area
	 5) Native Method area
	 */

	//jvm internal referance  is the one that will refer to the scp or slp
	
	public static void main(String[] args) {
		
        String s1 = new String(); //saved inside heap memory
        
                         //this literal is passed inside the constructor of the object
        String s2 = new String("Java");//this is stored in SLP or SCP area
        //two objects have been created, one due to new key word and the other due to literal pass
        //the "java' will be refereed by s2
        
        String s3 = new String("Python");
        //the name of the object is python and will be refereed by s3
        
        
                   //new key word will direct the memory to inside the heap memory pool
        String s4 = new String("Java");//Literal pass object
        //another object will not be created because there is already an object with the same name
        
        String s5 = "Java"; 
        //no object will be created
        // Reference will just point to the already object
        
        String s = "Hello World";
          //no object will be created the literal is being directly passed
		
	}

}
