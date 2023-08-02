package com.javaCode_0701;

public class ConcatString {
	
	public static void main(String[]args) {
		
		
		
		int i = 23;
		int j = 33;
		int k = i+j;
		int t = i*k;
		
		
		System.out.println("The value of k is  " +k );
		System.out.println("The value of t is  " +t);
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("The formula for hours and salary ");
		
		int hours = 40;
		int weeks = 4;
		int months = 12;
		int hourly = 60;
		
		char dollasign = '$';
	  double TheChange = .0;
	  int extra0 = 0;
	  char point = '.';
	
	  
		int yearly = hours*hourly*weeks*months; 
		
		  String str = "$"+yearly+".00";
		  
		 String actualSalary = "";
		
	   System.out.println("The yearly salary of someone making "+hourly+" an hour is " +yearly+dollasign);
		
		System.out.println("The yearly salary of someone making "+hourly+" an hour is " +dollasign+yearly+TheChange+extra0);
		//^ this will add an extra o idk why
		System.out.println("The yearly salary of someone making "+hourly+" an hour is " +dollasign+yearly+point+extra0+extra0);
		
		System.out.println("The yearly salary of someone making "+hourly+" an hour is " +str);
		
		System.out.println("---------------------------------------------------------------------------");
		
		if(str.equalsIgnoreCase(actualSalary)) {
			
			System.out.println("str is a good formula for " +actualSalary);
			
		} else {
			System.out.println("There is an error in str");
		}
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println(str);
		System.out.println(actualSalary);
		
		
		
	}
	

}
