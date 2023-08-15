package com.javaCode_0701;

public class ReversingStrings {

	public static void main(String[] args) {
		
		 String Pallindrome = "AibohphobiA";
         String Dummy = "";
         
         
                //we use minus one becaus arrays and strings are zero indexed,
         //so .length will not start from 0 but instead of 1, so .length will assume the size is 11
         //but the reality is our string is 10 because of the 0th position 
         //therefore we use minus 1, and if we were to remove it an error would be thrown
         for(int i =Pallindrome.length()-1; i>=0; i--) {
      	   
      	   Dummy = Dummy + Pallindrome.charAt(i);
      	  // System.out.println(Dummy8); run the print in the loop to make it appear letter by letter
         }
                System.out.println(Dummy);
                
                if(Dummy.equals(Pallindrome)) { // if we use Dummy8==Pallindrome it wont work
                	
                	System.out.println("our String "+Dummy+" is a Pallindrome");
                } else {
                	System.out.println("Our String "+Dummy+" is not a Pallindrome");
                }

	}

}
