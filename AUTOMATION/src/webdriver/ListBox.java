package webdriver;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[tabindex='0']")).sendKeys("vishal");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("surya");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[data-type='password']")).sendKeys("1230456");
		Thread.sleep(2000);
		
		  WebElement day=driver.findElement(By.cssSelector("select[title='Day']"));
		  
		 Select s = new Select(day);
	
		 s.selectByValue("15");
		 Thread.sleep(2000);
       WebElement month=driver.findElement(By.cssSelector("select[id='month']"));
       Select s1=new Select(month);
       s1.selectByVisibleText("Jun");
       Thread.sleep(2000);

       
		
		
	}
	

}
