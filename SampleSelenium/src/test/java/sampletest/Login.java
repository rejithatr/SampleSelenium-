package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//WebElement searchField = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
		WebElement searchField= driver.findElement(By.tagName("input"));
		searchField.sendKeys("Testing");
//		WebElement element2 = driver.findElement(By.linkText("Gmail"));
		WebElement gmailLink=driver.findElement(By.partialLinkText("Gma"));
		gmailLink.click();
		
	}

}
