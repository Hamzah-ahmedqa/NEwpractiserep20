package com.javaCode_0705;

public class LearningForLoops {

	public static void main(String[] args) {
		
		System.out.println("Print numbers from 1 -> 100 incresing by 5");
		
		for(int i = 0; i<=100; i=i+5) {
			System.out.print(i+" ");
			
		}System.out.println(" ");
		System.out.println("---------------------------------------------");
		System.out.println("Print natural numbers from 1 -> 100");
		
		for(int j = 1 ; j<=100; j++) {
			System.out.print(j+" ");
	
		}System.out.println(" ");
		System.out.println("---------------------------------------------");
		System.out.println("Print natural numbers from 1 -> 100 by 10");
		
		for(int t = 0; t<=100; t=t+10) {
			
			System.out.print(t+" ");
			
		}System.out.println(" ");
		System.out.println("---------------------------------------------");
		System.out.println("Print natural numbers from 5 -> 55 by 5");
		
		for(int x = 0; x<=55; x=x+5) {
			
			System.out.print(x+" ");
			
		}System.out.println(" ");
		System.out.println("---------------------------------------------");
		System.out.println("Print natural numbers from 100 -> 0 by 10");
		
		
		for(int s = 100; s>=0; s=s-10) {
			
			System.out.print(s+" ");
			
		}System.out.println(" ");
		System.out.println("---------------------------------------------");
		System.out.println("Print first 20 multiples of 2 and add the values");
		
		int sum = 0 ;
		for(int y = 0; y<=20; y=y+2) {
			
			System.out.print(y+" ");
			System.out.println(" ");
			System.out.println("---------------------------------------------");
			sum = sum+y;
			System.out.print(sum+" ");
			
		} System.out.println(" ");
		System.out.println("---------------------------------------------");
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		

	}

}
