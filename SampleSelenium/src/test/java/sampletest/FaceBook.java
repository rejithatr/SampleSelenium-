package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath("//input[@id='email']"));
		login.sendKeys("Rejitha");
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("Rejitha");		
		WebElement submitB=driver.findElement(By.xpath("//button[@name='login']"));
		submitB.click();
		WebElement repass=driver.findElement(By.xpath("//div[@class='_55r1 _1kbt']//input[@name='pass']"));
		repass.sendKeys("Rejitha");
		WebElement showpass=driver.findElement(By.xpath("//div[@class='_9lsb _9ls8']"));
		showpass.click();
//		WebElement forgotPass=driver.findElement(By.partialLinkText("Forgotten"));
//		forgotPass.click();

}}
