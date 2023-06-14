package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_class {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option =new ChromeOptions();
		option.addArguments("disable-notifications");
		
        WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        
        FB_login login=new FB_login(driver);
        login.clickFBCreateNewAccountBtn();
        Thread.sleep(2000);
        
        
        FB_Sign_up signup =new FB_Sign_up(driver);
        signup.clickListBox();
        Thread.sleep(2000);
        driver.quit();
        
		
	}

}
