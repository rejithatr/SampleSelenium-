package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	
		public static void main(String args[]) throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement faceText=driver.findElement(By.xpath("//h2[@class='_8eso']"));
		String text=faceText.getText();
		System.out.println(text);
		
		
		
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("test");
		WebElement loginButton=driver.findElement(By.xpath("//button[@name='login']"));
		loginButton.click();
		WebElement warnText2=driver.findElement(By.xpath("//div[@class='_9kq2']"));
		String text2=warnText2.getText();
		System.out.println(text2);
		
		
		
		
		
		
		WebElement WarnText=driver.findElement(By.xpath("//div[@class='_9ay7']"));
		String text1=WarnText.getText();
		System.out.println(text1);
		String baseurl = "http://www.keralartc.com/main.html";
		driver.navigate().to(baseurl);
		driver.manage().window().maximize();
		
		String baseurl3 = "https://www.ebay.com/";
		driver.navigate().to(baseurl3);
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@id='gh-ac']"));
		search.sendKeys("bags");
		Thread.sleep(10000);
		search.clear();
		search.sendKeys("books");
		WebElement submit=driver.findElement(By.xpath("//input[@id='gh-btn']"));
		submit.submit();
		

	}

}
