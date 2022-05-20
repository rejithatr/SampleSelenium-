package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "D:\\BrowserDrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	/*WebElement signInAccounts=driver.findElement(By.linkText("Account & Lists"));
	signInAccounts.click();*/
	WebElement startHere=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
	startHere.click();
	
	
//	WebElement signIn=driver.findElement(By.cssSelector(".nav-action-inner"));
//	signIn.click();
}
}
