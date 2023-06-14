package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrower {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
	//	driver.findElement(By.name("email")).sendKeys("vishal@123");
		
	//	driver.findElement(By.id("pass")).sendKeys("123@vish");
	//	driver.findElement(By.partialLinkText("Forgot")).click();
		driver.findElement(By.partialLinkText("Create new")).click();
	}

}
