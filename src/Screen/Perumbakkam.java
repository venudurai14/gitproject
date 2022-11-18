package Screen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Perumbakkam {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venu1\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		Thread.sleep(3000);
		WebElement scrolldown = driver
				.findElement(By.xpath("//span[contains(text(),'Greens technology Perumbakkam')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
	TakesScreenshot ts =(TakesScreenshot) driver; 
	File screenshotAs= ts.getScreenshotAs(OutputType.FILE);
	System.out.println(screenshotAs);
	File file = new File("C:\\screenshots selenium\\greens.png");
	FileUtils.copyFile(screenshotAs, file);
	

	}

}

