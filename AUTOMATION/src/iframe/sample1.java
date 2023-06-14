package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	    Thread.sleep(2000);
	    driver.switchTo().frame("iframeResult");
	    
	    driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
	    Thread.sleep(2000);
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	    Thread.sleep(2000);
	    driver.quit();
	   
	  
		
	}

}
