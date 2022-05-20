package sampletest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample {
	public static void main(String args[]) throws InterruptedException {
		String path = System.getProperty("user.dir");
		System.out.print(path);
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDriver\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 WebDriverWait wait=new WebDriverWait(driver,10);

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://selenium.obsqurazone.com/dynamic-load.php");
		driver.manage().window().maximize();
		
		WebElement getNewUserButton=driver.findElement(By.xpath("//button[@id='save']"));
		getNewUserButton.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-body']//p")));

		WebElement emailText=driver.findElement(By.xpath("//div[@class='card-body']//p"));
		String emailTextDetails=emailText.getText();
		System.out.println(emailTextDetails);
		
	}
}