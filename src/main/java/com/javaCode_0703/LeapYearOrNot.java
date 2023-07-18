package com.javaCode_0703;

public class LeapYearOrNot {

	public static void main(String[] args) {
		
		
		int year = 2012;
	    int year1 = 2015;
		
		
		
		//determine if this is a leap year or not
		
		//1996 is a leap year
		//2012 is a leap year
	
		//conditions for a leap year
		//1) the year is divisible by 400
		//2) the year is divisible by 4 but not 400
	
		
		if(year%4 ==0 && year%100 !=0 ||  year%400==0) {
			
			System.out.println(year+" is a leap year");
					
			} else{
				System.out.println(year+" is not a leap year");
			}
		
		
		
		
		
		
		
		

	}

}
