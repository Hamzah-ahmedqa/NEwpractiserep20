package com.javaCode0801;

public class Parent /*extends Child*/ {
                          //this will throw an error
	 static    Parent pt = new Parent();
	     
	 public static void main(String[]args) {
		 
		 pt.ParentsBankAccount();
		 //can only access its own
	 }
	 
	 
public void ParentsBankAccount() {
	
	System.out.println("parent has : 8500");
}

public void ParentsHouse() {
	System.out.println("The parent live her");
}

}
