package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver iDriver;
	
	public LoginPage(WebDriver rDriver) {
		iDriver=rDriver;
		
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement LoginBtn;
	
	@FindBy(xpath = "//button[normalize-space()='Open Menu']")
	WebElement LogoutBtn;
	
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	WebElement clickLogoutBtn;
	
	public void UName(String uname) {
		username.sendKeys(uname);
	}
	
	public void PWord(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void LoginButton() {
		LoginBtn.click();
	}
	
	public void LogoutButton() {
		LogoutBtn.click();
	}
	
	public void clickLogoutButton() {
		clickLogoutBtn.click();
	}
}
