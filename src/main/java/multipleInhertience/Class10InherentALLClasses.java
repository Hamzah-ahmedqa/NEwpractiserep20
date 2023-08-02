package multipleInhertience;

public class Class10InherentALLClasses extends Class9{
	
	static Class10InherentALLClasses robo = new Class10InherentALLClasses();
	
	//You can inherent all these methods directly from each class, incase another class inherent them before you can still call the class the methods, but the method body will be implemented into the class that called them before

	public static void main(String[] args) {
		
		robo.roboticEyes();  //Class 1
		robo.roboticEars();  //Class 2
		robo.roboticSpeakingVoice();  //Class 3
		robo.roboticFightingCapabilities(); //Class 4
		robo.roboticTypingSkills(); //class 5
		robo.roboticDoEverything(); //class 6
		robo.roboticKillingInstinct(); //Class 7
		robo.roboticBalance(); // Class 8
		robo.roboticAI(); // class 9
		
		System.out.println("------------------------------------------------------------------------------------------");
		
		robo.roboticChest(); //class 10
		robo.roboticCode(); //class 10
		robo.roboticJumpingCabailities();   //Class 10
		robo.roboticArms(); //class 10
		
		
		

	}

	@Override
	public void roboticMissionUpload() {
		System.out.println("This is code for |Class 10| and final boss MISSION UPLOAD");
		
	}

	@Override
	public void roboticLaserBeams() {
		System.out.println("This is code for |Class 10| and final boss LASER BEAMS -__-");
		
	}

	@Override
	public void roboticFriends() {
		System.out.println("This is code for |Class 10| and final boss H3LLO ROBOTIC FRIENDS ");
		
	}

	@Override
	public void roboticMasterMind() {
		System.out.println("This is code for |Class 10| and final boss I AM THE MASTERMIND ROBO");
		
	}

	@Override
	public void roboticChest() {
		System.out.println("This is code for |Class 10| and final boss THIS IS ME ROBO MAN BREATHING");
		
	}

	@Override
	public void roboticCode() {
		
		System.out.println("This is code for |Class 10| and final boss ROBOTIC CODE FOR ALL TO EDIT AND ADD");
	}

	@Override
	public void roboticJumpingCabailities() {
		
		System.out.println("This is code for |Class 10| and final boss THIS ROBOT CAN JUMP SO DAMN HIGH");
	}

	@Override
	public void roboticArms() {
		
		System.out.println("This is code for |Class 10| and final boss THIS ROBOT ARMS FLAIR OUT");
	}

	@Override
	public void roboticLegs() {
		System.out.println("This is code for |Class 10| and final boss THIS ROBOT LEGS CAN MOVE LIKE THE FLASH");
		
	}

}
