package com.javaCode_0701;

public class ReversingStrings {

	public static void main(String[] args) {
		
		 String Pallindrome = "AibohphobiA";
         String Dummy8 = "";
         for(int i8=Pallindrome.length()-1; i8>=0; i8--) {
      	   
      	   Dummy8 = Dummy8 + Pallindrome.charAt(i8);
      	  // System.out.println(Dummy8); run the print in the loop to make it appear letter by letter
         }
                System.out.println(Dummy8);
                
                if(Dummy8.equals(Pallindrome)) { // if we use Dummy8==Pallindrome it wont work
                	System.out.println("our String "+Dummy8+" is a Pallindrome");
                } else {
                	System.out.println("Our String "+Dummy8+" is not a Pallindrome");
                }

	}

}
