package extraTopics;

public class WrapperClasses {

	//wrapper classes are the classes that allow primitive data types to be used as onjects
	//instead of int, we can use integer object. here integer is the wrapper class
	//each primitive data type has its respective wrapper class 
	//there are 8 primitive data types
	//for certain things to be used as objects you need a class
/*	
  PRIMITIVE DATA TYPES  | WRAPPER CLASSES 
	                int --> Integer 
                 	short --> Short
	               boolean --> Boolean
	              char --> Character 
	             byte --> Byte
           	float --> Float
	      double --> Double
	    long --> Long 
	                      */
	//wrapper classes have a priority of useful methods to help in conversion operations
	
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		String s1 = "3000";
        Integer.parseInt(s1); //this converts String to an int 
        Boolean.valueOf(null); //converts String to boolean 
        
        //the concept of conversion is known as -Autoboxing
        //the automatic conversion of primitive data types to their respective wrapper classes
   
        
        //Unboxing is the opposite of Autoboxing
        //it is the automatic conversion of wrapper classes to their respective primitive data types
        
        int i = 10;
        //lets convert this into Integer
        Integer num = i; //java is automatically converting primitive data type int variable to Integer Object
                        //this is Autoboxing ^
        
        //integer is class , num is reference variable, = to i is 10
        
  
		Integer j = new Integer(100);
		int num1 = j;//this is unboxing 
		
		String s2 = "123456";
		//convert into int
		
		int num2 = Integer.parseInt(s2); //this will convert our string into an int 
		
		System.out.println(num2);
		
		boolean b = Boolean.valueOf(true); //converts String to Boolean
		
		Integer k = Integer.valueOf(345); //this is the proper way

		int valueofint = k.intValue(); //returns the underline int value
		
		//String to int
		String s3 = "40055";
		Integer num3 = Integer.parseInt(s3);
		System.out.println(num3);
        
		//Double wrapper class to primitive data type
		Double d = Double.valueOf(123.456);
		double doubleValue = d.doubleValue();
		System.out.println(doubleValue);
		
		//converting String to a double
		String s4 = "332.99";
		Double doubleValue2 = Double.parseDouble(s4);
		System.out.println(doubleValue2);
		
		
		
	}

	
	
}
