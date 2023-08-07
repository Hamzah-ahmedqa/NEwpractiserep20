package com.javaCode0802;

public class MethodOverLoading {

	public static void main(String[] args) {
                                    //can we overload the main method?
		                               //yes create overloaded main methods
		sampleData();
		sampleData(10);
		sampleData(20, 30);
		sampleData(40, 50, 60);
		sampleData("Hello");
		sampleData("Hello", "World");
		sampleData("Hello","World",30);
		sampleData( new StringBuffer("Marko"));
		sampleData( new StringBuilder("Polo"));

	}

	public static void sampleData() {
		System.out.println("This is code from sampleData Method");

	}

	// now this has become overloaded
	public static void sampleData(int i) {

		System.out.println("This is code from our sampleData Method with a single int parameter");
		System.out.println("-------------------");
	}

	public static void sampleData(int i, int j) {
		System.out.println("This is code from our sampleData Method with two int parameters");
		System.out.println("-------------------");
	}

	public static void sampleData(int i, int j, int t) {
		System.out.println("This is code from our sampleData Method with three int parameters");
		System.out.println("-------------------");
	}

	public static void sampleData(String s) {
		System.out.println("This is code from our sampleData Method with a single String parameter");
		System.out.println("-------------------");
	}

	public static void sampleData(String s1, String s2) {
		System.out.println("This is code from our sampleData Method with two String parameters");
		System.out.println("-------------------");
	}
	public static void sampleData(String s1, String s2, int i) {
		System.out.println("This is code from our sampleData Method with two String parameters and a single int parameter");
		System.out.println("-------------------");
}
	public static void sampleData(StringBuffer s1) {
		System.out.println("This is code from our sampleData Method with a StringBuffer parameter");
		System.out.println("-------------------");
	}
	public static void sampleData(StringBuilder s1) {
		System.out.println("This is code from our sampleData Method with a StringBuilder parameter");
		System.out.println("-------------------");
		
	}
}
