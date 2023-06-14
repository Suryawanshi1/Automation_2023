package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FB_Sign_up {
	@FindBy(id="day")private WebElement Day ;
	
	public FB_Sign_up(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickListBox() {
		//Day.click();
		Select s=new Select(Day);
		s.selectByValue("15");
		
		
	}
	

}
