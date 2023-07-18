package com.javaCode0717;

public class MethodInJava {

	//methods cannot be written inside of methods
	static MethodInJava mj = new MethodInJava();
	public static void main(String[] args) {
		System.out.println();
		//access modifier -> public which can be used throughtout the whole project without restrictions
		//static or non static
		// return type, boolean, void, int
		// and method name
		
		System.out.println("This is the main method");
		
		int sum2 = mj.sample1(70, 900);
		                         //since our ints are hardcoded in our method we will only get the hard coded answer 
		                          
		System.out.println(sum2);
         String val = sample2("hello","world");
         System.out.println(val);
		
	}
	
	
	public int sample1(int i, int j) {
		                  //parameters 
		              // we have already defined the data type so no need to declare int i = 10
		
		i = 15;
		j = 30;//this hard coded data will make it not flexible, the logic is only reading the hard coded data
		int n = 45;
		int sum = i + j+ n;
		System.out.println(sum);
		return sum; //this is what we want to return
		
	}
	
  public static String sample2(String s1, String s2) {
	
	  s1 = "hello";
	  s2 = "world";
	  
	String s3 = s1 + s2;
	return  s3;
	
	
}
    public static void letsDoSomeMagic() {
    	
    	
    }

    

}
