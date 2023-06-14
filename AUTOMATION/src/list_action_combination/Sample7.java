package list_action_combination;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        Thread.sleep(2000);
      WebElement fash = driver.findElement(By.xpath("//div[@class='_1psGvi SLyWEo']"));
      Actions act=new Actions(driver);
      act.moveToElement(fash).perform();
      Thread.sleep(2000);
         WebElement kid = driver.findElement(By.linkText("Kids"));
         Actions act1=new Actions(driver);
         act1.moveToElement(kid).perform();
         
          Thread.sleep(2000);
          
         WebElement boy = driver.findElement(By.linkText("Infant Wear"));
         boy.click();
         Thread.sleep(2000);
         driver.quit();
		
		
	}

}
