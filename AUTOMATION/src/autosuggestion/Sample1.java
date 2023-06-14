package autosuggestion;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Sample1 {
	public static void main(String[] args) throws InterruptedException {
		String expResult="iPhone 14";// name has given
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("iPhone");  
        Thread.sleep(2000);
        List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
        
        for (WebElement option : alloptions) {
			String actResult = option.getText();
            System.out.println(option.getText());//for printing all options
			if (actResult.equals(expResult)) {
				option.click();
				break;
			}
		}
        Thread.sleep(2000);
        driver.quit();
        
			

       

	}

}
