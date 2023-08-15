package com.JavaCode0813;

public class WhyAreStringImmutable {

	public static void main(String[] args) {
	
		
		//why are strings immutable?
	//what are mutants ? things that change like x-men
		//immutable means cannot change
		//The immutability concept is only used for string objects
		//STRING OBJECTS ARE IMMUTABLE
	//once string objects are created the data or state cannot be changed
		
//if we try to change the state of a string object instead of changing it will instead create another object
		
		String s1 = new String("Apple");
		s1.concat("Fruit");//only trying to modify the object
		//the change that this will cause is the creation of another object
		//the content of the new object will be AppleFruit
		
		//we cannot see this concept but it is a back-end process
		
		System.out.println(s1); //the outcome will not be AppleFruit, it will still be Apple
		
		
		System.out.println(s1.concat(" Macbook pro"));
		
		//we can change the reference point 
		
		s1 = s1.concat(" Iphone");
		//the reference point has changed not the object, a new object will be created that we can point to
		System.out.println(s1);
		
		String s2 = new String("Apple");
		//instead of creating a new object it will refer to the old one
		
		//why are strings actually immutable ?
		
	    String state1 = "Virginia";
	//one object will be created which is Virginia, that will be pointed to by state1
	    
	    String state2 = "Virginia"; // no object will be created
	    //just another reference to point to that object
	    
	    String state3 = "Virginia"; 
	    //this will also point to Virginia
		
	    //imagine this goes on till 
	    String state50 = "Virgina";
	    
	    //imagine state30 has decided to become maryland
	    //then if string were mutable all 50 of them would become maryland 
	    //but because they are not a new object will be created which is maryland and virginia will still exist 
	    
	    //like if one person want to change their password a new object will created but why change that for everyone
	    
	    //if we open tutorials ninja and go to my account then register
	    // and we want to store the application data in an excel or whatever for 100 users
	    //100 different names, last names, email and etc
	    //imagine we want to change something, it would not be wise to change something on the page 
	    //but rather a new object that will still point to password
	    
	    
	    
		

	}

}
