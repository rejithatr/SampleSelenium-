package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassAssignment {
	public static void main(String args[]) throws InterruptedException
	{
		String path = System.getProperty("user.dir");
		System.out.print(path);
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDriver\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php/");
		driver.manage().window().maximize();
		
		WebElement selectColour=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select selectcolours=new Select(selectColour);
		selectcolours.selectByIndex(2);
		//selectcolours.selectByValue("Yellow");
		
		
		
		
		String expectedColour="First selected color is : Red";
		WebElement multiSelectColour=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select mutlSelectcolours=new Select(multiSelectColour);
		mutlSelectcolours.selectByIndex(0);
		WebElement buttonFirstSelect=driver.findElement(By.xpath("//button[@id='button-first']"));
		buttonFirstSelect.click();
		
		WebElement selectedColourLabel=driver.findElement(By.xpath("//div[@id='message-two']"));
		String actual=selectedColourLabel.getText();
		System.out.println(actual);

		if(actual.equals(expectedColour))
		{
			System.out.println("Success");
			
		}
		Thread.sleep(2000);
		
		WebElement selectMultiColour=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select selectMultiColours=new Select(selectMultiColour);
		selectMultiColours.selectByIndex(2);
		selectMultiColours.selectByIndex(1);
	}

}
