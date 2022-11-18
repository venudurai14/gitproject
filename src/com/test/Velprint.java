package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Velprint {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\venu1\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement textlogin = driver.findElement(By.xpath("//p[contains(text(),'Velmurugan currently')]"));
		String text = textlogin.getText();
		System.out.println(text);

	}

}
