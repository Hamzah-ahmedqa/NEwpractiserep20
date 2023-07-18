package testNGBeginning;

import org.testng.annotations.Test;

public class TwoAlphaMalesInTheSameHouse {
	static TwoAlphaMalesInTheSameHouse callnonStatic = new TwoAlphaMalesInTheSameHouse();
	TwoAlphaMalesInTheSameHouse callstatic = new TwoAlphaMalesInTheSameHouse();
	
	public static void main(String[] IamTheAlpha) {
		
		System.out.println("I am the main method alpha");
		callnonStatic.ImAlpha();
	}
	
	
	@Test
	public void ImAlpha() {
		
		System.out.println("I am the @test method alpha");
	//	callstatic.main(null); this doesnt work

	}

	
	//you should not ever do this
}
