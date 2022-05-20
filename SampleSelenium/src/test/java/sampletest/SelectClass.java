package sampletest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class SelectClass {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement newAccount=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		newAccount.click();

		/*WebElement firstName=driver.findElement(By.xpath("//input[@id='u_e_b_0p']"));
		firstName.click();
		WebElement sureName=driver.findElement(By.xpath("//input[@id='u_e_d_jC']"));
		sureName.click();*/

		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select daySelect=new Select(day);
		daySelect.selectByIndex(2);
		
		//daySelect.selectByValue("3");
		//daySelect.selectByVisibleText(text);
		day.click();
		
	}

}
