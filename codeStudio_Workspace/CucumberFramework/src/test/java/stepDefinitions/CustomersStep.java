package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class CustomersStep{

	public WebDriver driver;
	public LoginPage loginpg;
	
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginpg = new LoginPage(driver);
		
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	    
		driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailAdd, String pwd) {
	    
		loginpg.enterEmail(emailAdd);
		loginpg.enterPassword(pwd);
	}

	@When("Click on Login")
	public void click_on_login() {
	   
		loginpg.clickOnLoginBtn();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	    
	}
///Login feature methods
	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
	    
		loginpg.clickOnLogoutBtn();
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
	}
	
	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {
	   
	}

	@When("User click on customers Menu")
	public void user_click_on_customers_menu() {
	    
	}

	@When("click on customers Menu Item")
	public void click_on_customers_menu_item() {
	    
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {
	    
	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
	   
	}

	@When("User enter customer info")
	public void user_enter_customer_info() {
	   
	}

	@When("click on Save button")
	public void click_on_save_button() {
	   
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
	    
	}

}
