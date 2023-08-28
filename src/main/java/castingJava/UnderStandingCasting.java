package castingJava;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderStandingCasting {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
	//what is casting ?
		//casting in java is a process of converting a value of one data type to another 
		//take an object of a particular shape and put into a container of a different shape
		//if you bake a cake in a circle pan and try putting it into a square pan
  //or if you have water in a big jug and you try putting it into a cup,
		// maybe the the cup would be too small and not fit all the water
	//or the cup is too big and all the water wont fit 
		
//if we cast one data type to another we need to make sure 
		//that the data we are converting is not lost or changed in the process    
		
		//we dont want our data to change like the cake or cup
		
		//so we have two different types of casting
		/*1) WIDENING CASTING (implicit casting)
	EXAMPLE- pouring water from a smaller jug of water to a bigger cup
	everything will fit, and there will be space to
	like if we want to store int value into a long 
	we dont need to cast this, java will automatically do it 
	java will widen the int to long  
		
		2) NARROWING CASTING  (explicit casting)
			example - pouring jug of water from bigger to smaller cup
		the amount of water is more than the cup can hold the rest will spill out
		so when we convert a larger data type to a smaller one we need to make sure the data is not lost
		or changed in the process
		this is not done automatically, we have to explicitly cast it in java 
		like from double to int 
		casting can also be used to convert to incompatible data types
		
		        */
		                                        //casting the webdriver object which is referenced by driver 
		JavascriptExecutor jse = ((JavascriptExecutor)driver);		
		//this is nothing but an interface which is used in java in selenium to define methods
		//for for executing our java script code in the context of a particular webpage 
		//since we want to use those unimplemented method of that interface 
		//we need to cast the webdriver object to the jse object
		
		JavascriptExecutor jse1 = ((JavascriptExecutor)driver);	
//we use the cast operator(JavascriptExecutor) to explicitly cast the webdriver object to a JavascriptExecutor object      
		//this is explicit casting 
		
		
		
		
		
		
		
		
		
		int num = 1;
		long numl = num; //automatically widened to long| this is ->Widening casting or implicit casting 
		                              //widened or converting :)
		
		double dum = 12345.5;
		int dum1 = (int)dum;  //this explicitly narrowed to an int 
		//explicit casting
		
		String s1 = "109";
		int numval = Integer.parseInt(s1);
		//this is a way of incompitable way of doing casting, using wrapper classes
	
		char c = '!';
		int numchar = (int)c;
		//this will return an askie value 
		System.out.println(numchar);
		
	}

}
