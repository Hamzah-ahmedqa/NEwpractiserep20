package com.javaCode_0701;

public class Decrement_and_Increment {

	public static void main(String[] args) {
		
		
		int i = 1;          
		System.out.println("This the value of i variable in its first print : " +i);
		System.out.println("------------------------------------------------------");
		
		int j = --i;        
		
		System.out.println("This the value of i variable in its secound print : " +i);
		System.out.println("This the value of j variable in it's first print: " +j);
		System.out.println("-------------------------------------------------------");
		
		int k = i++ - --i + i++;
		
		System.out.println("This the value of i variable in its third print : " +i);
		System.out.println("This the value of j variable in it's secound print: " +j);
		System.out.println("This the value of k variable in its first print : " +k);
		System.out.println("--------------------------------------------------------");
		
		int l = j++ + ++k + --i - i--;    
		
		System.out.println("This the value of i variable in its fourth print : " +i);
		System.out.println("This the value of j variable in it's third print: " +j);
		System.out.println("This the value of k variable in its secound print : " +k);
		System.out.println("This the value of l variable in its first print : " +l);
		System.out.println("--------------------------------------------------------");
		
		System.out.println("This the final value of i variable : " +i);
		System.out.println("This the final value of j variable : " +j);
		System.out.println("This the final value of k variable : " +k);
		System.out.println("This the final value of l variable : " +l);
		
		

	}

}
