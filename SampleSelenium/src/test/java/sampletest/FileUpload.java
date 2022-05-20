package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	/*public static void Fileupload(String element,String path)
	{
		element.se
	}*/
	public static void main(String args[]) {
		String path = System.getProperty("user.dir");
		System.out.print(path);
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDriver\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement chooseFile=driver.findElement(By.xpath("//input[@id='file-upload']"));
		chooseFile.sendKeys("C:\\Users\\Rejitha\\Desktop\\obsqura zone\\Navigation Assignment.txt");
		
		WebElement upload=driver.findElement(By.xpath("//input[@id='file-submit']"));
		upload.click();
	}
}
