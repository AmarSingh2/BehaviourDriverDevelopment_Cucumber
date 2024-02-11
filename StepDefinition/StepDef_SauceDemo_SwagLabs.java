package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDef {

	WebDriver driver;
	LoginPage loginPage;
	
	@Given("User Launch Edge Browser")
	public void user_launch_edge_browser() {
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
	}

	@When("User open URL {string}")
	public void user_open_url(String url) {
	    driver.get(url);
	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String uname, String pwd) {
		loginPage=new LoginPage(driver);
		loginPage.UName(uname);
		loginPage.PWord(pwd);
		loginPage.LoginButton();
	}

	@Then("Page title as {string}")
	public void page_title_as(String expectedTitle) {
	  String actualTitle = driver.getTitle();
	  
	  if(expectedTitle.equals(actualTitle)) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.assertTrue(false);
	  }
	}

	@When("User click on logout button")
	public void user_click_on_logout_button() throws InterruptedException {
		loginPage.LogoutButton();
		Thread.sleep(4000);
		loginPage.clickLogoutButton();
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	    driver.quit();
	}
}
