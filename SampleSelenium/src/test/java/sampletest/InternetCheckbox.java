package sampletest;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternetCheckbox {
	public static void main(String args[]) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDriver\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * String baseUrl = "https://the-internet.herokuapp.com/"; driver.get(baseUrl);
		 * if (baseUrl.equals(driver.getCurrentUrl())) { System.out.println("sucess");
		 * driver.manage().window().maximize(); } else { System.out.println("failed");
		 * 
		 * }
		 * 
		 * WebElement clickcheckbox =
		 * driver.findElement(By.xpath("//a[contains(text(),'Checkboxes')]"));
		 * clickcheckbox.click();
		 */
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		WebElement checkbox1 = driver.findElement(By.xpath("//form//input[1]"));
		WebElement checkbox2 = driver.findElement(By.xpath("//form//input[2]"));

		System.out.println("checkbox1 " + checkbox1.isDisplayed());
		System.out.println("checkbox2 " + checkbox2.isDisplayed());

		System.out.println("checkbox1 " + checkbox1.isEnabled());
		System.out.println("checkbox2 " + checkbox2.isEnabled());

		if (checkbox1.isSelected() == false) {
			checkbox1.click();
		}
		if (!checkbox2.isSelected()) {
			checkbox2.click();
		}

		System.out.println("checkbox1 " + checkbox1.isSelected());
		System.out.println("checkbox2 " + checkbox2.isSelected());

		driver.navigate().to("www.ebay.com");

		// driver.navigate().to("www.ebay.com");

	}
}
