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
		
		/*
		 Condition: The condition is enclosed in parentheses (). It's a combination of logical and arithmetic operations.

Leap Year Conditions:

(year % 4 == 0 && year % 100 != 0): This part of the condition checks if the year is divisible by 4 (year % 4 == 0) and is not divisible by 100 (year % 100 != 0). This condition covers the case where a year is divisible by 4 but not by 100. This is a common rule for leap years.
year % 400 == 0: This part of the condition checks if the year is divisible by 400. This condition covers the case where a year is divisible by 400, which is another rule for leap years.
Logical Operators:

&& (logical AND): This operator combines two conditions and returns true only if both conditions are true.
|| (logical OR): This operator combines two conditions and returns true if at least one of the conditions is true.
Execution:

If either of the conditions mentioned above is true, it means the year satisfies the conditions for being a leap year. In this case, the code within the curly braces {} under the if statement is executed. It prints a message indicating that the year is a leap year.

If none of the conditions are true, it means the year is not a leap year, and the code within the curly braces {} under the else statement is executed. It prints a message indicating that the year is not a leap year.

So, the entire code snippet checks whether the given year is a leap year according to the specified conditions and prints the appropriate message based on the evaluation of those conditions.
		 
		 */
		
		
		
		
		
		

	}

}
