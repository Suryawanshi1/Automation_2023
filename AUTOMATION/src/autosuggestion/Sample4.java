package autosuggestion;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {
	public static void main(String[] args) throws InterruptedException {
		String expResult="redmi note 11";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.id("APjFqb")).sendKeys("redmi");
	    Thread.sleep(3000);
	       List<WebElement> alloptions = driver.findElements(By.xpath("((//ul[@class='G43f7e'])[1])//li"));
	       for(WebElement option:alloptions) {
	    	   System.out.println(option.getText());
	    	  String actResult= option.getText();
	    	  if(actResult.equals(expResult)) {
	    		  option.click();
	    		  break;
	    	  }
	       }
	       Thread.sleep(2000);
	}
}
