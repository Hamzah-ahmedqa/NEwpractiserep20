package com.JavaCode0813;

public class SavingSecretPasswordInStringOrCharacterArray {

	//if there is a super secret or very secretive password you want to save 
	// will you rather save in a string or character array?
	
	//always store in char[] for passwords
	
	
	public static void main(String[]args) {
		
		String s1 = "Password"; //string is immutable because it will not change its value
		
		char c1 [] = {'P','a','s','s','w','o','r','d'};
		
		
		
		
		System.out.println(s1);
		System.out.println(c1);//when we print it alone without concatenation it will show
		
		char [] c2 = new char []{'P','a','s','s','w','o','r','d','1'};
		
		System.out.println("The password in our string object is :" +s1);
		System.out.println("The password in our char array is :" +c1);
		System.out.println("The password in our char array is :" +c2); 
		//Because when we call it like this the console will show like [C@515f550a or something
		//cannot retrieve the value in in char array when we try to concatenate it with something
	
		
	}
	
	
}
