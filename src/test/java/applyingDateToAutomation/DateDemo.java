package applyingDateToAutomation;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		
		Date date = new Date();
		System.out.println(date);

		//theress spaces in the output that we need to remove 
		 
		                                          //space is replaced with underscore
		System.out.println(date.toString().replace(" ", "_"));
		
		System.out.println(date.toString().replace(" ", "_").replace(":","_"));
	}

}
