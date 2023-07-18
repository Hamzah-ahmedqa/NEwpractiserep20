package com.javaCode_0705;

public class WhileLoops {

	public static void main(String[] args) {
		
		boolean b1 = true;
		
		
		while(b1 != false) {
			
			System.out.println("egg salad");
			break;
		}
		
		
				
		for(int i = 0; i <=10 ; i++) {
			//this is easier for me a for loop
			System.out.print(i+" ");
		}
		
		System.out.println("");
		System.out.println("---------------------------------------------------");
		System.out.println("Print in increasing order from 1 to 10 ");
		
		int j=1;
		while(j<=10) {
			System.out.print(j+" ");
			j++;
		}
		
		System.out.println("");
		System.out.println("---------------------------------------------------");
		System.out.println("Print in decreasing order from 20 to 1 ");
		int t = 20;
		while(t>=1) {
		System.out.print(t+" ");
		t--;
			
		}
		
		System.out.println("");
		System.out.println("---------------------------------------------------");
		System.out.println("Print in increasing order from 2 to 40 by 2 ");
		
		int n = 1;
		while(n<=20) {
			System.out.print(n*2+" ");
			n= n+1;
			
		}
		
		System.out.println("");
		System.out.println("---------------------------------------------------");
		System.out.println("Print in increasing order from 2 to 40 by 2 for loop");
		for(int d = 2 ; d<=40 ;d=d+2) {
			System.out.print(d+" ");
			
		}
		
		
		System.out.println("");
		System.out.println("---------------------------------------------------");
		System.out.println("Print in decreasing order from 100 to 5 by 5");
		int x = 100;
		while(x>=5) {
			System.out.print(x+" ");
			x=x-5;
			
		}
		
		System.out.println("");
		System.out.println("---------------------------------------------------");
		System.out.println("Print in decreasing order from 100 to 5 by 5 for loop");
		for(int x1=100; x1>=5; x1=x1-5) {
			System.out.print(x1+" ");
			
		}
	

	}

}
