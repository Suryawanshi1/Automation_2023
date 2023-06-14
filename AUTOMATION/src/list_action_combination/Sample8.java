package list_action_combination;

import java.io.IOException;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample8 {
 public static void main(String[] args) throws InterruptedException, IOException {
	
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://skpatro.github.io/demo/links/");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@name='home']")).click();
     Thread.sleep(2000);
     driver.findElement(By.linkText("SignUp Form")).click();
     Thread.sleep(2000);
     driver.findElement(By.id("username")).sendKeys("vishal");
     Thread.sleep(2000);
     driver.findElement(By.id("email")).sendKeys("abc@4123");
     Thread.sleep(2000);
     driver.findElement(By.id("tel")).sendKeys("1234567");
     Thread.sleep(2000);
     WebElement more = driver.findElement(By.xpath("//select[@name='sgender']"));
     Select s=new Select(more);
     s.selectByVisibleText("Male");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@name='experience']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@id='ip'][2]")).click();
     Thread.sleep(2000);
     WebElement multi = driver.findElement(By.xpath("//select[@id='tools']"));
     Select s1=new Select(multi);
     s1.selectByIndex(1);
     s1.selectByVisibleText("QTP");
     s1.selectByIndex(2);
     s1.selectByIndex(3);
     
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@name='commit']")).click();
     Thread.sleep(2000);
     Alert alt = driver.switchTo().alert();
     alt.getText();
     alt.accept();
     Thread.sleep(2000);
     
    
     
     
     
     
     

     
     

         
     
}
}
