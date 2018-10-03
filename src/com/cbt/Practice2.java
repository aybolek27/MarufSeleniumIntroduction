package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aybolek\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		// 1. Open chrome
		WebDriver driver = new ChromeDriver();
		//	2. go to url www.cybertekschool.com
		driver.get("http://www.cybertekschool.com");
//		3. Verify url contains
		String expected="cybertekschool";
		String actual=driver.getCurrentUrl();
		if(actual.contains(expected)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
			System.out.println("Expected: " + expected);
			System.out.println("Actual: " + actual);
		}
			
//		Expected: cybertekschool

	}

}
