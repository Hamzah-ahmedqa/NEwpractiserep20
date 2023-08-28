package extraTopics;

public class UsingEncapsulatedMethods {

	public static void main(String[] args) {
		EncapsulationDemo car = new EncapsulationDemo("BMW","M3",2012);
		System.out.println(car.getMake());
		System.out.println(car.getModel());
	    System.out.println(car.getYear());
		

	}

}
