package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate {
	public static void main(String args[]) throws InterruptedException {
		String path = System.getProperty("user.dir");
		System.out.print(path);
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDriver\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement text1 = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		text1.sendKeys("12");
		String actual = text1.getText() + text1.getAttribute("value");
		System.out.println(actual);
		WebElement button = driver.findElement(By.xpath("//button[@id='button-one']"));
		button.click();
		String expected = button.getText() + button.getAttribute("value");
		System.out.println(expected);

		if (actual.equals(expected)) {
			System.out.println("Success");

		} else {

			System.out.println("Failed");

		}
		Thread.sleep(2000);

		/*
		 * text1.clear(); text1.sendKeys("haiii");
		 */

		WebElement button1 = driver.findElement(By.xpath("//button[@id='button-one']"));
		button1.click();

		WebElement val1 = driver.findElement(By.xpath("//input[@id='value-a']"));
		val1.sendKeys("12");

		WebElement val2 = driver.findElement(By.xpath("//input[@id='value-b']"));
		val2.sendKeys("12");
		WebElement total = driver.findElement(By.xpath("//button[@id='button-two']"));
		total.click();

		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();

		WebElement checkOne = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkOne.click();

		WebElement check1 = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement check2 = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement check3 = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement check4 = driver.findElement(By.xpath("//input[@id='check-box-four']"));
		if (check1.isSelected() == false) {
			check1.click();

		}
		if (check2.isSelected() == false) {
			check2.click();

		}
		if (check3.isSelected() == false) {
			check3.click();

		}
		if (check4.isSelected() == false) {
			check4.click();

		}
		driver.navigate().refresh();

		WebElement button2 = driver.findElement(By.xpath("//input[@id='button-two']"));
		/* button2.click(); */
		WebElement button3 = driver.findElement(By.xpath("//input[@id='is_checked']"));
		String c = button3.getText();
		System.out.println(c);

		String b = button2.getAttribute("value");
		System.out.println(b);

		if (b.equals("Select All")) {
			button2.click();
			System.out.println("Success");
		}

	}

}
