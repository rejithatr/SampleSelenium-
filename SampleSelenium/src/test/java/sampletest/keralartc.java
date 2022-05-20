package sampletest;

import org.checkerframework.checker.interning.qual.EqualsMethod;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keralartc {
	public static void main(String args[]) throws InterruptedException {
		String path = System.getProperty("user.dir");
		System.out.print(path);
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDriver\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl = "http://www.keralartc.com/main.html";
		driver.manage().window().maximize();
		driver.get(baseurl);
		String title = driver.getTitle();
		if (baseurl.equals(driver.getCurrentUrl())) {
			System.out.println("Success");
			
		}

		WebElement eticket=driver.findElement(By.xpath("//a[contains(text(),'E-Ticketing')]"));
		eticket.click();
		WebElement citycircular=driver.findElement(By.xpath("//a[contains(text(),'City Circular')]"));
		citycircular.click();
		WebElement notification=driver.findElement(By.xpath("//a[contains(text(),'Notification')]"));
		notification.click();
		Thread.sleep(10000);
		driver.close();
	
		
		
	}

}