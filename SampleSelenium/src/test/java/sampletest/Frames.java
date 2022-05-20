package sampletest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.print(path);
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDriver\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// WebDriverWait wait=new WebDriverWait(driver,10);

		driver.get("https://www.softwaretestinghelp.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// driver.switchTo().frame(1);
		driver.switchTo().frame("__tcfapiLocator");
		// driver.switchTo().frame("mce_0_ifr");
		List<WebElement> iFrameList = driver.findElements(By.xpath("//iframe"));
		System.out.println(iFrameList.size());
	}

}
