package Screen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venu1\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/odi");
		WebElement table = driver.findElement(By.xpath("//table[@class='table']"));
		WebElement heading = table.findElement(By.xpath("//tr[@class='table-head']"));
		List<WebElement> headingElements = heading.findElements(By.tagName("th"));
		for (int i = 0; i < headingElements.size(); i++) {
			WebElement individualheading = headingElements.get(i);
			System.out.println(individualheading.getText());
			
		}

		}

	}


