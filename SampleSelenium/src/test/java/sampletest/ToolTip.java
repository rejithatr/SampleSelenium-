package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {
	public static void main(String args[]) throws InterruptedException {
		String path = System.getProperty("user.dir");
		System.out.print(path);
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDriver\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();
		
		WebElement mail=driver.findElement(By.xpath("//a[@class='mail']"));
		String mailTooltip=mail.getAttribute("title");
		System.out.println(mailTooltip);
		
		WebElement google=driver.findElement(By.xpath("//a[@class='google']"));
		String googleTooltip=google.getAttribute("title");
		System.out.println(googleTooltip);
		
		WebElement youtube=driver.findElement(By.xpath("//a[@class='you-tube']"));
		String youtubeTooltip=youtube.getAttribute("title");
		System.out.println(youtubeTooltip);
		
		WebElement github=driver.findElement(By.xpath("//a[@class='github']"));
		String githubTooltip=github.getAttribute("title");
		System.out.println(githubTooltip);
		
		WebElement facebook=driver.findElement(By.xpath("//a[@class='facebook']"));
		String facebookTooltip=facebook.getAttribute("title");
		System.out.println(facebookTooltip);
		
		
		WebElement rss=driver.findElement(By.xpath("//a[@class='rss']"));
		String rssTooltip=rss.getAttribute("title");
		System.out.println(rssTooltip);
	}

}
