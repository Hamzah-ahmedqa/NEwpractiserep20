package forAbstractMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//wont let me extend another class
public class FinalValue extends DemoAbstractClass implements InterfaceExecute, InterfaceTwo{
                                                //this is for interfaces, can implement multiple interfaces
	
	//class can extend another class
	// class can implement an interface
	//class can implement multiple interfaces
	//class can extend another class and implement multiple interfaces
	//interface cannot implement a class
		// interface an extend another interface
		//interface cannot extend a class
	//interface cannot implement another interface
	
	public static void main(String[] args) {
//final value is known as the implementing class
		//it has the responsibility to invoke the the unimplemented methods
		// ^of the abstract class it extends and interfaces it implements 
		
		//can an abstract class implement an interface?
		// YES IT IS ALLOWED
		
		//can we create an object of an interface?
		 // ^ the answer is no. 
		
		//WebDriver driver = new WebDriver()
		// ^ cannot create the object of an interface | Cannot instantiate the type WebDriver
		
		//ChromeDriver is the implementing class
		
		//webdriver is an interface
		WebDriver driver = new ChromeDriver(); 
		                       //chromeDriver is not an abstract class


	}

	@Override
	public void robotArms() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void robotLegs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void robotHead() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void robotEyes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void robotAi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void robotDanceAbilities() {
		// TODO Auto-generated method stub
		
	}

}
