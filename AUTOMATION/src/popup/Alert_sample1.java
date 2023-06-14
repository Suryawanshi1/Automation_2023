package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_sample1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        Thread.sleep(2000);
        Alert alt = driver.switchTo().alert();
        alt.getText();
        alt.accept();
        Thread.sleep(4000);
        
                  Alert alt1 = driver.switchTo().alert();
                  alt1.getText();
                  alt1.accept();
                  Thread.sleep(6000);
                  driver.quit();
        
		
	}

}
