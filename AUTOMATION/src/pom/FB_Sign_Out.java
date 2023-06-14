package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Sign_Out {
	@FindBy(xpath="//span[text()='Log Out']")private WebElement SignOut;
	public FB_Sign_Out(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void clickFBSignOutBtn() {
		SignOut.click();
	}

}
