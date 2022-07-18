package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements( rdriver,this);
	}
	
	
	@FindBy(id="identifierId")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@class='whsOnd zHQkBf']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")
	@CacheLookup
	WebElement nxtButton;
	
	@FindBy(id="passwordNext")
	@CacheLookup
	WebElement nxtButton2;
	
	@FindBy(xpath="//li[@class='HTqe8e KKjvXb']")
	@CacheLookup
	WebElement homButton;
	
	public void setEmail(String email) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void clickNext() {
		nxtButton.click();
	}
	
	
	public void clickNext2() {
		nxtButton2.click();
	}
	

	public void isAvailable() {
		homButton.isDisplayed();
	}
	
	
}
