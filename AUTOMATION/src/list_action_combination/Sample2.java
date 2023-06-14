package list_action_combination;

import java.util.List;

import org.openqa.selenium.By;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Sample2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        Thread.sleep(2000);
        WebElement DAY = driver.findElement(By.xpath("//Select[@id='day']"));
        Select s=new Select(DAY);
        s.selectByValue("30");
        Thread.sleep(2000);
        //size
                           List<WebElement> list = s.getOptions();
                           int size=list.size();
                           System.out.println(size);
         //display 
                           Select s1=new Select(DAY);
                             List<WebElement> list1 = s.getOptions();
                             for(WebElement li:list1) {
                            	 System.out.println(li.getText());
                             }
      
	}

}
