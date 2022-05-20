package sampletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	public static void main(String args[])
			{
		String path=System.getProperty("user.dir");
		System.out.println("testFDFDG"+path);
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\BrowserDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
			}

}
