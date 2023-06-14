package list_action_combination;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class sample {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	                WebDriver driver = new ChromeDriver();
	                driver.manage().window().maximize();
	                driver.get("https://www.facebook.com/");
	              //  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vishal@12345");
	             //   Thread.sleep(2000);
	             //   driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
	              //  Thread.sleep(2000);
	              //  driver.findElement(By.xpath("//button[@name='login']")).click();
	              //  driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
	                
	                 


	            //    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vishal");  
	            //    Thread.sleep(2000);
	            //    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("suryawan");
	            //   Thread.sleep(2000);
	               WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	               Select s=new Select(day);
	              List<WebElement> alloptions = s.getOptions();
	                        int size= alloptions.size();
	                        System.out.println(size);
	                        for(WebElement option:alloptions) {
	                        	System.out.println(option.getText());
	                        	Thread.sleep(2000);
	                        	
	                        }      
	            
	
	                    
	              
	               
	
	}
	}

