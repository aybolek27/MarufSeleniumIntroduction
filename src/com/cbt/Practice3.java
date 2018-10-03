package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) {
		
		
//		
//		TEst case 3: basic authentication
//		1. open chrome
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aybolek\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		2. go to url "http://newtours.demoaut.com"
		driver.get("http://newtours.demoaut.com");
//		3. enter username "tutorial"
		driver.findElement(By.name("userName")).sendKeys("tutorial");
//		4. enter password "tutorial"
		driver.findElement(By.name("password")).sendKeys("tutorial");
//		5. click on Sign in button
		driver.findElement(By.name("login")).click();
//		6. Verify title contains
//		Expected: welcome
		String expected = "Find a Flight";
		String actual = driver.getTitle();
		System.out.println(actual);

		if (expected.equals(actual)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
			System.out.println("Expected: " + expected);
			System.out.println("Actual: " + actual);
		}

	}
}
