package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();		
		
		WebElement roundtrip = driver.findElement(By.xpath("//div[contains(text(),'round trip')]"));
		roundtrip.click();
		WebElement deals = driver.findElement(By.xpath("//div[contains(text(),'Deals')]"));
		deals.click();
		Thread.sleep(10000);
		WebElement gifts = driver.findElement(By.xpath("//div[contains(text(),'Gift Card')]"));
		gifts.click();	
		Thread.sleep(10000);
		WebElement spiceclub = driver.findElement(By.xpath("//div[contains(text(),'SpiceClub')]"));
		spiceclub.click();
		Thread.sleep(10000);
		WebElement cargo = driver.findElement(By.xpath("//div[contains(text(),'Cargo')]"));
		cargo.click();
		Thread.sleep(10000);
	}
	

}
