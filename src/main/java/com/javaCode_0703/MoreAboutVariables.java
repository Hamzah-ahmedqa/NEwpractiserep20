package com.javaCode_0703;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MoreAboutVariables {
	//static methods can only call static variables 
	static WebDriver driver;

	public static void main(String[] args) {
		
    driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev");
		
	}

}
