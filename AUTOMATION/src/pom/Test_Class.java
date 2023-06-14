package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_Class {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option =new ChromeOptions();
		option.addArguments("disable-notifications");
		
        WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        
        FB_login login =new FB_login(driver);
        login.setFBLoginUsername();
        login.setFBLoginPassword();
        login.clickFBLoginBtn();
        Thread.sleep(2000);
        
        
    
        
        FB_Home home=new FB_Home(driver);
        home.clickFBHomePageSignOutBtn();
        Thread.sleep(2000);
        
        FB_Sign_Out signOut=new FB_Sign_Out(driver);
        signOut.clickFBSignOutBtn();
        Thread.sleep(2000);
        

        
        
        
        
        
        
	}

}
