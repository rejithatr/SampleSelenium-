package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruDemoTest {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
//		WebElement selinum=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
//		selinum.click();
//		WebElement radio=driver.findElement(By.xpath("a[text()='Radio & Checkbox Demo']"));
//		radio.click();

		WebElement radio1 = driver.findElement(By.xpath("//input[@id=\"vfb-7-1\"]"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.xpath("//input[@id=\"vfb-7-2\"]"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.xpath("//input[@id=\"vfb-7-3\"]"));
		radio3.click();

		WebElement check1 = driver.findElement(By.xpath("//input[@id=\"vfb-6-0\"]"));
		check1.click();
		WebElement check2 = driver.findElement(By.xpath("//input[@id=\"vfb-6-1\"]"));
		check2.click();
		WebElement check3 = driver.findElement(By.xpath("//input[@id=\"vfb-6-2\"]"));
		check3.click();

	}
}
////ul[@class='dropdown-menu']//a[text()="Radio & Checkbox Demo"]
//System.setProperty("webdriver.edge.driver", "C://EdgeDriver.exe");
////EDGEDRIVER IMPLIMENTAtion class
//# for id
// . for class

/*
 * text() and contains methods
 * 
 * text(): A built-in method in Selenium WebDriver that is used with XPath
 * locator to locate an element based on its exact text value. Example: //*[
 * text() = ‘Get started free’ ]
 * 
 * 
 * contains(): Similar to the text() method, contains() is another built-in
 * method used to locate an element based on partial text match. For example, if
 * we need to locate a button that has “Get started free” as its text, it can be
 * located using the following line of code with Xpath. Example: //*[ contains
 * (text(), ‘Get started’ ) ]
 */