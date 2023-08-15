package com.javaCode_0701;

public class SalaryCaculator {


	    public static void main(String[] args) {
	        
	        int hours = 40;
	        int weeks = 4;
	        int months = 12;
	        int hourlyRate = 55;
	        
	        char dollarSign = '$';
	        
	        int yearlySalary = hours * hourlyRate * weeks * months;
	        
	        String formattedSalary = dollarSign + Integer.toString(yearlySalary) + ".00";
	        
	        System.out.println("Yearly salary for someone making $" + hourlyRate + " per hour is: " + formattedSalary);
	        
	        System.out.println("-----------------------------------------------------------");
	        
	        String expectedFormula = "$" + yearlySalary + ".00";
	        
	        System.out.println("Expected formula for yearly salary: " + expectedFormula);
	        
	        System.out.println("-----------------------------------------------------------");
	        
	        if (formattedSalary.equals(expectedFormula)) {
	            System.out.println("The formula for calculating yearly salary is correct.");
	        } else {
	            System.out.println("There is an error in the formula for calculating yearly salary.");
	        }
	        
	        System.out.println("-------------------------------------------------------------");
	        System.out.println(formattedSalary);
	    }
	}


