package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import cucumber.api.java.en.*;
import pageObjects.LoginPage;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;

	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
	    lp=new LoginPage(driver);
	    
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("User enters Email as {string}")
	public void user_enters_Email_as(String email) {
	    lp.setEmail(email);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   
	}

	@Then("Click on Next")
	public void click_on_Next1() throws InterruptedException {
	    lp.clickNext();
	   Thread.sleep(2000);
	}
	
	@Then("User enters Password as {string}")
	public void user_enters_Password_as(String pwd) {
	   lp.setPassword(pwd);
	}

	@Then("Click on Next2")
	public void click_on_Next2() {
	    lp.clickNext2();
	}
	
	
	@Then("The Home Button should be avaliable")
	public void checking_for_btn() {
		lp.isAvailable();
	}
	@Then("close the browser")
	public void close_the_browser() {
	    driver.quit();
	}


}
