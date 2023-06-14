package list_action_combination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
        Thread.sleep(2000);
        WebElement Day = driver.findElement(By.id("day"));
        Select s=new Select(Day);
        System.out.println(s.getOptions().size());
                   List<WebElement> alloptions = s.getOptions();
                   for(WebElement list:alloptions) {
                	   System.out.println(list.getText());
                   }
                   Thread.sleep(1000);
     
       // s.selectByValue("20");
      //  Thread.sleep(2000);
     //   if (s.isMultiple()) {
      //  	System.out.println("List Box is single selectable ");
     //   }else {
      //  	System.out.println("List Box is multiselectable ");
   //     }
   //     Thread.sleep(2000);
   //     driver.quit();
        
        
        
		
	}

}
