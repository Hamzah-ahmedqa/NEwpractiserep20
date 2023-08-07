package com.javaCode0802;

public class MainMethodOverLoading {

	public static void main(String[] args) {
		//this is method overloading for the main method
		main();
		main(args = new String[4], args = new String[10]);
		main(25);
		main(30,35);
		main(new StringBuilder("Dat"));
		main(new StringBuffer("Boi"));
		main(new StringBuilder("Hello"),new StringBuffer("World"));
		
		
		

	}

	public static void main() {
    System.out.println("This is our main method with no parameters");
    System.out.println("-------------------------------------------");
	}
	public static void main(String[] args1, String[] args2) {
	    System.out.println("This is our main method with two string array parameters");
	    System.out.println("-------------------------------------------");
		}
	public static void main(int i) {
	    System.out.println("This is our main method with a single int parameter");
	    System.out.println("-------------------------------------------");
		}
	public static void main(int i,int j) {
	    System.out.println("This is our main method with two int parameters");
	    System.out.println("-------------------------------------------");
	    
	}
	public static void main(StringBuilder s1) {
		System.out.println("This is our main method with a StringBuilder parameter");
		System.out.println("-------------------------------------------");
	}
	public static void main(StringBuffer s1) {
		System.out.println("This is our main method with a StringBuffer parameter");
		System.out.println("-------------------------------------------");
	}
	public static void main(StringBuilder s1, StringBuffer s3) {
		System.out.println("This is our main method with a StringBuilder and StringBuffer parameter");
		System.out.println("-------------------------------------------");
	}

}
