package sampletest;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitPrograms {
	public static void main(String args[]) throws InterruptedException
	{
		String path = System.getProperty("user.dir");
		System.out.print(path);
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDriver\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait=new WebDriverWait(driver,10);
		//im
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		
		
		
		WebElement example=driver.findElement(By.xpath("//div[@class='example']//h4"));
		String exampleText=example.getText();
		System.out.println(exampleText);
		
		WebElement startButton=driver.findElement(By.xpath("//div[@id='start']//button"));
		startButton.click();
		//Thread.sleep(7000);
		//explicit wait
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']//h4")));
		WebElement hello=driver.findElement(By.xpath("//div[@id='finish']//h4"));
		String helloText=hello.getText();
		System.out.println(helloText);
		//wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='finish']//h4","helloText));
		//for alerts//wait.until(ExpectedConditions.alertIsPresent());
		//for buttons//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='start']//button")))
	}
	
}

//implicit wait
//,fluent wait,explicit wait
//fluent wait
/*WaitPrograms<WebDriver> waits = new FluentWait<WebDriver>(driver)							
.withTimeout(30, TimeUnit.SECONDS) 			
.pollingEvery(5, TimeUnit.SECONDS) 			
.ignoring(NoSuchElementException.class);*/