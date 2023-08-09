package extentReporterClass;

public class SystemInfoDemo {

	
	public static void main(String[]args) {
		
		System.getProperties().list(System.out);	
		//this will tell you the the operating system ,java version and a lot of other things
		System.out.println("------------------");
		
		System.out.println(System.getProperty("os.name"));
		
		System.out.println(System.getProperty("os.version"));
		
		System.out.println(System.getProperty("user.name"));
		
		System.out.println(System.getProperty("java.vendor"));
		
		
		
		
		
	}
	
	
}
