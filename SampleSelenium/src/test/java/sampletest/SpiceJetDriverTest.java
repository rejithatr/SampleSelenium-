package sampletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetDriverTest {
	public static void main(String args[]) {
		String path = System.getProperty("user.dir");
		System.out.println("testFDFDG" + path);
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.spicejet.com/";
		driver.get(baseUrl);
		String tilte = driver.getTitle();
		if (baseUrl.equals(driver.getCurrentUrl())) {
			System.out.println("URLS are matching");
			System.out.println(tilte);

		} else {
			System.out.println("URLS are not matching");
		}

	}

}
