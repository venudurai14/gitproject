package org.test;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venu1\\Downloads\\chromedriver_win32");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //To take screenshot
        Take Screenshot ts =(TakeScreenshot)driver;
        File ScreenshotAs= ts.getscreenshotAs(outputType.FILE);
        System.out.println(ScreenshotAs);
      
        
	}

}
