package special_classes_in_Java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.LocalDate;



public class CodeForDateConcepts {
	static Date currentDate;
	
	public static void main(String[] args) {
		//create a new date object representing the current date and time
		 currentDate = new Date();
		 
		System.out.println("The current date is : "+ currentDate);
		            // The current date is : Tue Aug 22 15:28:54 EDT 2023
		             //this is what prints 
		//long is the primitive data type that holds the highest amount
		
             long millieseconds = currentDate.getTime();
             System.out.println(millieseconds);
                         // 1692732753036 
             //Epoch is the evolving of computer time
             //epoch time for computer starts from January - 1970 00:00:00 GMT
             //how many millie seconds have past since then 
             
             //get the year, month, day, hour, minute , second, of a date
             
             ///this class that represents the date without a timezone
           LocalDate currentDate1 =  LocalDate.now();
          int year = currentDate1.getYear();
          int month = currentDate1.getMonthOfYear();
          int day = currentDate1.getDayOfMonth();
          System.out.println("Year is :"+year+" and the month is :"+month+" and the day is :"+day);
             
          
          
          //create a LocalTime Object representing the current time
          LocalTime lt =LocalTime.now();
          int hour = lt.getHour();
          int second = lt.getSecond();
          int minute = lt.getMinute();
          
          System.out.println("The hour is : "+hour+" and the minute is :"+minute+" and the second is :"+second);
       
          
        //check if two dates are equal or not?
  		
  		Date anotherDate = new Date(millieseconds);
  	 boolean dateEqualOrNot = currentDate.equals(anotherDate);
  	 System.out.println("Verifying if the dates are the same or not : "+dateEqualOrNot);

  	 
  	 //get the past date
 	DateFormat df = new SimpleDateFormat("MMddyyyy");
	Date myDate = new Date(System.currentTimeMillis());//this is the amount of miilieseconds in a day
	Date oneDayBefore = new Date(myDate.getTime()-86400000);
	String Str = df.format(oneDayBefore);
	System.out.println("result is :"+Str);
  	 
  	 
  	 //compare two dates?
  //int comparison1 = currentDate.compareTo(Integer.parseInt(Str));
  //	 System.out.println("Comparison result is ->"+comparison);
  	 

	
	// check if the current date is before or after specified date?
	currentDate.after(anotherDate);
	currentDate.before(anotherDate);

	boolean isAfter = currentDate.after(anotherDate);
	boolean isBefore = currentDate.before(anotherDate);
	System.out.println("The date is before " + isBefore);
	System.out.println("The date is after " + isAfter);
		
		
	//how to create a copy of the current date object?
	Date copy = (Date) currentDate.clone();
	System.out.println("copy of the date is :"+copy);
	
	
	//how to set the time represented by the current date object to a specified value?
	//Tue Aug 22 19:05:10 EDT 2023
	long newTime = 1692745664570L; //0
	currentDate.setTime(newTime);
	System.out.println("The new time is :"+currentDate);
	
	
	// how to convert the current date object to an instant object?
	Instant instant = currentDate.toInstant();
	System.out.println("The instant object is :"+instant);
	
	//HOW TO CONVERT DATE OBJECT TO A STRING -> VERY IMPORTANT 
	String dateString = currentDate.toString();
	
	System.out.println("The string is :"+dateString);
	
	
	//date object that will represent a specific day and format the same way 
	Calendar calendar = Calendar.getInstance();//created a calendar object
	calendar.set(2000, calendar.JANUARY,31);//set it to this specific date
	
	Date newYear = calendar.getTime();//we called the get time method to represent the date abpve 
	
	SimpleDateFormat df1 = new SimpleDateFormat("MM/dd/yyyy");
	String dateString1 = df1.format(newYear);
	System.out.println("the formatted date is :"+dateString1);
	
	
	//adding a certian number of days to a date object and display the result
	Calendar calendar1 = Calendar.getInstance();
	calendar1.setTime(new Date());//it will set the calendar to todays date 
	//add 1 week to the calendar
	calendar1.add(Calendar.DAY_OF_YEAR, 7);
	Date Adding1Week = calendar1.getTime();
	
//format the added week date
	SimpleDateFormat df2 = new SimpleDateFormat("MM/dd/yyyy");
	String dateString2 = df2.format(Adding1Week);
	System.out.println("Adding one week date is :"+dateString2);
	
	
	
	}	
}