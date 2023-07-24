package com.javaCode0719;

public class OOPS_Pillars_inJava {
	
	
static OOPS_Pillars_inJava opj = new OOPS_Pillars_inJava();
//create an object of our class
//you can also do this with interface

	
	public static void main(String[] args) {
		
		//java is not 100% oop because it allows primitive data types - int, boolean
		//java understands the interaction within and between objects
		
		
		// oops   
	/*     ||||		
	       ||||  
	       ||| the s is system or structure 
	       ||Programming 
	       |Oriented
	       Object	
		                                                     
                 selenium is based off of java                                            */
                                                             
		
		//6 pillars of java 
		/*
		1)classes and objects
		class is a collection of Methods
		when we create a class we define the name, there are some classes that are predefined 
		like object, 
		a class is also a collection of methods 
		A template or blueprint where we can write and define our objects and methods 
		Every object is an instance of a class.
		class does not occupy memory space because it is a logical entity
		a road to driver your vehicles 
		classes do not have physical entity cannot be defined 
		like fruit is a class, you take a fruit type but the word fruit itself, just like animal,  and etc.
		
		an object is an instance of a class
		object is a physical entity, so therefore object occupies memory space
		the memory is heap area
		Properties of OBJECT
		Identification(name) dog
		State (breed,color,age)
        Behavior (barking, sleeping,fetching)
        object is a collection of all nonstatic entities of a class
        static is does not belong to object because they all already interact with eachother s
		
		2)Methods
		3)Inheritance
		4)Polymorphism 
		5)Abstraction
		6)Encapsulation
		
		
		
		
		*/
		sample();
		OOPS_Pillars_inJava.sample();
		//our class          our method
		opj.testSample();
		
	//	OOPS_Pillars_inJava.testSample(); this is not allowed to call this because it is not static 
	}
	
	public static void sample() { //because this is static it can be called directly 
	 System.out.println("This is the sample method");
		
	}
	
	public void testSample() {
		
		System.out.println("Test code");
	}

}
