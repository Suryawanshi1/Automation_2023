package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_login {
	@FindBy(xpath = "//input[@id='email']")
	private WebElement UN;
	@FindBy(xpath="//input[@name='pass']")
	private WebElement PWD;
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement loginBtn;

	public FB_login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setFBLoginUsername() {
		UN.sendKeys("8381086437");
	}

	public void setFBLoginPassword() {
		PWD.sendKeys("Svishal@4321");

	}

	public void clickFBLoginBtn() {
		loginBtn.click();
		
		
		
		
	}

}