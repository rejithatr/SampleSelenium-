package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonEnabled {
	public static void main(String args[]) throws InterruptedException {
		String path = System.getProperty("user.dir");
		System.out.print(path);
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDriver\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.manage().window().maximize();
		
		WebElement firsName=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		WebElement lastName=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		WebElement userName=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		WebElement city=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		WebElement state=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		WebElement zip=driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		WebElement checkBox=driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		WebElement submitButn=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		WebElement successMsg=driver.findElement(By.xpath("//div[@class='my-2']"));
		/*String sucessMsg=successMsg.getText();
		System.out.println(sucessMsg);*/
		
		firsName.sendKeys("Rejitha");
		Thread.sleep(2000);
		lastName.sendKeys("TR");
		Thread.sleep(2000);
		userName.sendKeys("reji");
		Thread.sleep(2000);
		city.sendKeys("TVM");
		Thread.sleep(2000);
		state.sendKeys("Kerala");
		Thread.sleep(2000);
		zip.sendKeys("695612");
		Thread.sleep(2000);
		submitButn.click();
		Thread.sleep(5000);
		if(checkBox.isSelected()==false)
		{
			submitButn.click();
			System.out.println("Failed");
			checkBox.click();

		
		}
		
		if(checkBox.isEnabled()==true)
		{
			submitButn.click();
			System.out.println("Success");

		}
		
		//System.out.println(sucessMsg);
	}

}