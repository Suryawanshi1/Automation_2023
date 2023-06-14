package pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_login {
	@FindBy(xpath="//a[contains(text(),'Create')]")private WebElement NewAccountBtn ;
	
	public FB_login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickFBCreateNewAccountBtn() {
		NewAccountBtn.click();
	}

}
