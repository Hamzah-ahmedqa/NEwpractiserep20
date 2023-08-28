package extraTopics;
//in this below example, we created a class that has 3 private variables 
//those three are make model and year
//since they are private those variables cannot be accessed outside of the class
//we provided public methods for each varable 
////this will allow the external code (code from another class) to access and modify the values in a CONTROLLED MANNER

public class EncapsulationDemo {

	private String make;
	private String model;
	private int year;
	
	
	     //create a constructor
	public EncapsulationDemo(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
		//this operator refers to the current class instance variables
		// and incase we are defining certain local variables which is equal to the instance variables
		//this helps to differentiate the variables between local and instance variables 
		

	}
	public String getMake() {
		return make;
		//creating a method return the make of the model
	}
	
	public void setMake(String make) {
		this.make=make;
		
	}
	
	public String getModel() {
		return model;
		
	}
	
	public void setModel(String model) {
		this.model=model;
		
	}
	
	public int getYear() {
		return year;
	
	}
	
	public void setYear(int year) {
		this.year=year;
		
	}
	
	
	
	
	
}
