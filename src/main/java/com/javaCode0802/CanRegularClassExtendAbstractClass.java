package com.javaCode0802;

import org.openqa.selenium.WebDriver;

public class CanRegularClassExtendAbstractClass extends LearningAbstract_Class{
	
	//can we create an object of the abstract class
	//absolutely not!!!!!!!!!!!!!!!!!!!
	//Because nothing will be hidden
	/*
	 * an abstract class cannot be instantiated on its own
	 */
	// LearningAbstract_Class objref =new LearningAbstract_Class();
	//this error will say Cannot instantiate the type LearningAbstract_Class
	
	static LearningAbstract_Class ref = new CanRegularClassExtendAbstractClass();
	//the abstract class can make an object of the child class
	
	public static void main(String[] args) {
	ref.sample();
	ref.name = "humza";
	ref.holdOnWereGoingHome();
	ref.imTired(23);

	}
	//now those unimplemented abstract methods are being called here with a body
	//the child class asks for a body

	@Override
	public void sample() {
	
		System.out.println("Sample method that was implemented in our child class");
	}

	@Override
	public void holdOnWereGoingHome() {
		
		System.out.println("holdOnWereGoingHome method that was implemented in our child class");
	}

	@Override
	public void imTired(int i) {
		System.out.println("imTired method that was implemented in our child class");
		
	}

}
