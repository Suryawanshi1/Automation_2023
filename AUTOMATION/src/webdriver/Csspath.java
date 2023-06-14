package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csspath {
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("vishal@1234");
	//	driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("123467");
	//	driver.findElement(By.cssSelector("button[type='submit']")).click();
			driver.findElement(By.cssSelector("a[rel='async']")).click();
			
	}

}
