package com.javaCode0719;

public class StaticVSNon_Static {

	//if you want to interact at a class level you have to use the word static, if you want to do class to class
	//non static is non static by nature, you dont write non static
	//static only interacts with static entities 
	//non static = object level interaction
		static StaticVSNon_Static svn = new StaticVSNon_Static();
	public static void main(String[] args) {
		
		StaticVSNon_Static svn1 = new StaticVSNon_Static();
		
		Ssample(); //can call directly because it is static
		svn.sample2();
        svn.sample2();
	}
	
	public static void Ssample() {
		
		int i = 10;
		int j = 20;
		int sum = i + j;
		
		System.out.println(sum);
	
		
	}

	
	public void sample2() {
		
		String S1 = "Hello";
		String S2 = "World";
		
		System.out.println(S1+S2);
		Ssample(); //non static can interact with static but not vice versa 
	}
	
}
