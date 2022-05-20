package sampletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CSSSelcetor {
	public static void main(String args[]) throws InterruptedException {
		String path = System.getProperty("user.dir");
		System.out.print(path);
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDriver\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 WebDriverWait wait=new WebDriverWait(driver,10);

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php");
		
		
	}
}
