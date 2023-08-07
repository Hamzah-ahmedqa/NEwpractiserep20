package com.javaCode0802;

//interfaces are 100% abstraction
	//all the variables inside the interface are by default 
	/* 
	 1)public
	 2)static 
	 3)final 
	 this is by the nature of interfaces
	 */
	
        //what is an interface?
	 //interface is a blueprint of a class
	//it specifies the methods that the class should implement
	//but it does not provide any implementation details to the class
	//interface tells class what to do but not how to do it 
	//the implementation details of the methods are left to the class
	
	//driver.manage().window().maximize();
	      // these are all unimplemented abstract methods

//all methods in an interface are abstract 
	

public interface ThisIsAnInterface {
	
public static final int i =30;
  //both bottom and top are the same
int j =22;


/*
	int i = 10;
	i = 15; this will not work because once you declare the value in an interface it is final and cannot be changed
	i++;
	          */
 default void secret() {
	//default methods are only allowed in interfaces using keyword
}
 
 public  void johnWick();
  //dont have to add the abstract method, by default they are abstract in nature
 

       public static  void moreSecrets() {
	          //methods can be static
}

}

