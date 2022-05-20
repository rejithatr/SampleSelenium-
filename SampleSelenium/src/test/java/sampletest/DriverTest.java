package sampletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverTest {
	public static void main(String args[])
	{
		String path=System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\BrowserDriver\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String url;
		String title;
		title=driver.getTitle();
		url=driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);

	}

}
//driver