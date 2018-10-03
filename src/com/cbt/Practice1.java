package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		// Test Case 1: verify title
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aybolek\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		// 1. Open chrome
		WebDriver driver = new ChromeDriver();
		// 2. go to url www.google.com
		driver.get("http://google.com");
		// 3. Verify title

		// Expected: Google
		String expected = "Google";
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
