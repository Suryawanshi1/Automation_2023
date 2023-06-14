package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Sample1 {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com/");
    Thread.sleep(2000);
    

    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    System.out.println(src);
  String random = RandomString.make(4);
  File dest=new File("C:\\Users\\HP\\Downloads\\screenshot\\flipcard"+random+".pnb");
  FileHandler.copy(src, dest);
  Thread.sleep(2000);
  driver.quit();
  
    
    
    
    
    
    
}
}
