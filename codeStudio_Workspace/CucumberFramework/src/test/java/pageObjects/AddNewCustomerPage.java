package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {
	
	public WebDriver driver;
	
	
	public AddNewCustomerPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
	WebElement Customers_menu;
	
	@FindBy(xpath = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	WebElement Customers_link;
	
	@FindBy(css = "a[class='btn btn-primary']")
	WebElement addNewBtn;
	
	@FindBy(id = "Email")
	WebElement emailTF;
	
	@FindBy(id = "Password")
	WebElement passwordTF;
	
	@FindBy(id = "FirstName")
	WebElement firstnameTF;
	
	@FindBy(id = "LastName")
	WebElement lastnameTF;
	
	@FindBy(id = "Gender_Female")
	WebElement genderRadioBtn;
	
	@FindBy(id = "DateOfBirth")
	WebElement dobTF;
	
	@FindBy(css = ".k-icon.k-i-calendar")
	WebElement dobDatePicker;
	
	@FindBy(id = "Company")
	WebElement companyName;
	
	@FindBy(id = "IsTaxExempt")
	WebElement taxExemptCheckBox;

}
