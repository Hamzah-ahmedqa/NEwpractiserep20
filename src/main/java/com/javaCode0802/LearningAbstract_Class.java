package com.javaCode0802;

public abstract class LearningAbstract_Class {
       // now that we add this keyword it becomes an abstract class
	
	public String name;
	public int age;
	//these instance variables will not be called becuase we cannot create an object of abstract class
	
	
	public void Test() { //abstract class can have normal methods too
		
		
	}
	
	public abstract void sample(); //this method does not have a block because it is an unimplemented method
	                                  //or abstract method
	      //it only has declaration, does not and cannot have a body
	
	//abstract method can only be inside an abstract class,
	
	public abstract void holdOnWereGoingHome();
	
	public abstract void imTired(int i); //yes you can overload abstract methods
}
