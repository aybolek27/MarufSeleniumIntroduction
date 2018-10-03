package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 {

	public static void main(String[] args) {
		
//		TEst case 3: basic authentication
//		1. open chrome
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aybolek\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		2. go to url "http://testing-ground.scraping.pro/login"
		driver.get("http://testing-ground.scraping.pro/login");
//		3. enter username "admin"
		driver.findElement(By.id("usr")).sendKeys("admin");		
//		4. enter password "12345"
		driver.findElement(By.id("pwd")).sendKeys("12345");
//		5. click on Sign in button
		driver.findElement(By.xpath("//input[@value['Login']]")).click();
		
//		6. Verify title contains
//		Expected: welcome
		String expected = "welcome";
		String actual = driver.getTitle();
		System.out.println(actual);

		if (actual.contains(expected)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
			System.out.println("Expected: " + expected);
			System.out.println("Actual: " + actual);
		}




	}

}
