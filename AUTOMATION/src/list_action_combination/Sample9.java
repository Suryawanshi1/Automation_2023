package list_action_combination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample9 { 
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://skpatro.github.io/demo/links/");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@name='home']")).click();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.linkText("DragnDrop")).click();
	     Thread.sleep(2000);
	     
	     WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
	     Thread.sleep(2000);
	     
	     WebElement des = driver.findElement(By.xpath("//div[@id='droppable']"));
	     Thread.sleep(2000);
	     Actions act=new Actions(driver);
	     act.dragAndDrop(src, des).perform();
	     Thread.sleep(2000);
	     driver.quit();
	     


	     
	     
		
	     
	    
		
		
	}

}
