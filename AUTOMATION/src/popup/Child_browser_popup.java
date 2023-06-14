package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Child_browser_popup {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
        Thread.sleep(2000);
        Set<String> ids = driver.getWindowHandles();
               ArrayList<String> al = new ArrayList<String>(ids);
               System.out.println(al.get(0));
               System.out.println(al.get(1));
               driver.switchTo().window(al.get(1));
               driver.manage().window().maximize();
              WebElement more = driver.findElement(By.linkText("More"));
              Actions act =new Actions(driver);
              act.moveToElement(more).perform();
              Thread.sleep(2000);
              driver.findElement(By.linkText("Cypress")).click();
            
              
              
              
               
        
        
        
        
		
	}

}
