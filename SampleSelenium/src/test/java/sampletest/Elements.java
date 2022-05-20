package sampletest;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elements {
	public static void main(String args[]) throws InterruptedException {
		String path = System.getProperty("user.dir");
		System.out.print(path);
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDriver\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// WebDriverWait wait=new WebDriverWait(driver,10);

		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement emailText=driver.findElement(By.xpath("//a[@class='nav-link']"));
		String emailTextDetails=emailText.getText();
		System.out.println(emailTextDetails);
		
		List<WebElement>TextElements= driver.findElements(By.xpath("//a[@class='nav-link']"));
		/*String text1=TextElements.get(2).getText();
		System.out.println(text1);
		String text2=TextElements.get(4).getText();
		System.out.println(text2);*/
		for(WebElement text:TextElements)
		{
			System.out.println(text.getText());			
			
		}
		System.out.println(TextElements.size());
		
		List<WebElement>links= driver.findElements(By.xpath("//div"));
		
			System.out.println(links.size());
}
}