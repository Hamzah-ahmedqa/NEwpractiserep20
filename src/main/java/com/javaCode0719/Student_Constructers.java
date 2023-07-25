package com.javaCode0719;

public class Student_Constructers {
	
	
	//Constructors is a block that has the same name of the class --method can have different names, c mandatory has the class name
	//it is similar to a method
	//it looks like a method
	//Constructor has no return type, not even void ---methods have a return type
	//it can acknowledge all access modifiers, public,private,protected, and default 
	//constructors are invoked the moment object is created
	
	//when an object is created compiler invokes constructor, but compiler will never invoke the method
	//constructors uses -
	/* 1) Initialize an object
	   2) optimize code of the class
	 
	 */
	
	//constructors are NOT used to create objects NOT AT ALL
	
	//types of constructors |
	/*1)Default constructor [compiler auto generates this when an object is created]
	 * 2) No Argument Constructor [user-defined]
	 * 3)parameterized Constructor [user defined]
	 
	 */
	//constructor is created the moment you create an object, we cannot see it until we want to optimize it so we create it
	
	//if i give these a values  it will by default be inside of the object we created
	public String Name; //by default this is null
	int Student_ID;    //by default this is 0
	public int Age;
	

	public static void main(String[] args) {

		Student_Constructers sc1 = new Student_Constructers("Mark",107,20); //occupy heap memory
		/* sc1.Name="Mark"	;
		sc1.Student_ID=107;
		sc1.Age=20; 
		              */
		System.out.println(sc1.Age+" "+sc1.Student_ID+" "+sc1.Name);
		                            //2 students take 6 lines of code, imagine there 6k students
		                            //and also there is more data like classes,grades, and etc
	                                //this is where constructor comes into place
		
		Student_Constructers sc2 = new Student_Constructers("Tom",108,19);
	/*	sc2.Name="Tom";
		sc2.Student_ID=108;
		sc2.Age=19;
		*/
		System.out.println(sc2.Age+" "+sc2.Student_ID+" "+sc2.Name);
		
		   //if i want it to only have one argument then we have to create the constructor that relates to the need
		Student_Constructers sc3 = new Student_Constructers("Jack");
		System.out.println(sc3.Name);

	//	Student_Constructers sc4 = new Student_Constructers(); hover mouse over the error
		
		
	}
	                              //because these parameters are passed the object needs to be full-filled 
	public Student_Constructers(String Name, int Student_ID, int Age) {
		 
		this.Name=Name;
		//used to instantiate local variables with instance variables 
		this.Student_ID=Student_ID;
		this.Age=Age;
		
		
	}
	public Student_Constructers(String Name) {
		this.Name=Name;
		
	}
	
	

}
