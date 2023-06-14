package list_action_combination;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        Thread.sleep(2000);
         
         Actions act =new Actions(driver);
        
        driver.findElement(By.linkText("Mobiles")).click();
        
        Thread.sleep(2000);
        
  WebElement more = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[1]"));
      act.moveToElement(more).build().perform();
       Thread.sleep(2000);
     //  driver.findElement(By.linkText("Realme")).click();  
     //  Thread.sleep(2000);
       driver.findElement(By.linkText("Asus")).click();
       Thread.sleep(2000);
 
      
	}

}
  