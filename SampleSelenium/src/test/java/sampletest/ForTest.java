package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForTest {
	public static void main(String args[]) {
		String path = System.getProperty("user.dir");
		System.out.print(path);
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDriver\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();

		/*
		 * WebElement
		 * searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 * String attributeValue=searchbox.getAttribute("id"); String
		 * attributeName=searchbox.getAttribute("aria-label");
		 * System.out.println(attributeValue); System.out.println(attributeName); String
		 * tagName=searchbox.getTagName(); System.out.println(tagName); WebElement
		 * search=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		 * String tagName1=search.getAttribute("title"); System.out.println(tagName1);
		 */

//		System.out.println(searchbox.getSize()); (540, 38)
		WebElement ok = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		ok.click();

		WebElement searchButton = driver.findElement(By.xpath("//button[@class='search_btn train_Search']"));

		String colour = searchButton.getCssValue("color");
		System.out.println(colour);
		String font=searchButton.getCssValue("font-size");
		System.out.println(font);
		String backGround=searchButton.getCssValue("background-color");
		System.out.println(backGround);

	}
}
