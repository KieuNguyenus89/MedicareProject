package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage {
	By firstName = By.xpath("//input[@id='firstName']");
	By lastName = By.xpath("//input[@id='lastName']");
	By email = By.xpath("//input[@id='email']");
	By contactNo = By.xpath("//input[@id='contactNumber']");
	By password = By.xpath("//input[@id='password']");
	By confirmPassword = By.xpath("//input[@id='confirmPassword']");
	By selectUser = By.xpath("//input[@id='role1']");
	By selectSupplier = By.xpath("//input[@id='role2']");
	By nextBillingBtn = By.xpath("//button[normalize-space()='Next - Billing']");

	By addressLineOne = By.xpath("//input[@id='addressLineOne']");
	By addressLineTwo = By.xpath("//input[@id='addressLineTwo']");
	By city = By.xpath("//input[@id='city']");
	By postalCode = By.xpath("//input[@id='postalCode']");
	By state = By.xpath("//input[@id='state']");
	By country = By.xpath("//input[@id='country']");
	By nextConfirmBtn = By.xpath("//button[normalize-space()='Next - Confirm']");
	By confirmBtn = By.xpath("//a[normalize-space()='Confirm']");
	By loginBtn = By.xpath("//a[normalize-space()='Login Here']");

	String supplierFirstName = "John";
	String supplierLastName = "Kenedy";
	String EmailSupplier = "Supplier2@gmail.com";
	String userFirstName = "Anna";
	String userLastName = "Smith";
	String EmailUser = "user2@gmail.com";
	String ContactNo = "123456789";
	String Password = "123";
	String ConfirmPassword = "123";

	String AddressLineOne = "101 main street";
	String AddressLineTwo = "location";
	String City = "Atlanta";
	String PostalCode = "123";
	String State = "CA";
	String Country = "US";

	public SignUpPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void signUpSupplier() {
		setText(firstName, supplierFirstName);
		setText(lastName, supplierLastName);
		setText(email, EmailSupplier);
		setText(contactNo, ContactNo);
		setText(password, Password);
		setText(confirmPassword, ConfirmPassword);

		clickElement(selectSupplier);

		clickElement(nextBillingBtn);

		setText(addressLineOne, AddressLineOne);
		setText(addressLineTwo, AddressLineTwo);
		setText(city, City);
		setText(postalCode, PostalCode);
		setText(state, State);
		setText(country, Country);

		clickElement(nextConfirmBtn);
		clickUsingButton(confirmBtn);

	}

	public void signUpUser() {
		setText(firstName, userFirstName);
		setText(lastName, userLastName);
		setText(email, EmailUser);
		setText(contactNo, ContactNo);
		setText(password, Password);
		setText(confirmPassword, ConfirmPassword);

		clickElement(selectUser);
		clickElement(nextBillingBtn);

		setText(addressLineOne, AddressLineOne);
		setText(addressLineTwo, AddressLineTwo);
		setText(city, City);
		setText(postalCode, PostalCode);
		setText(state, State);
		setText(country, Country);

		clickElement(nextConfirmBtn);
		clickUsingButton(confirmBtn);

	}

	public void clickLoginBtn() {
		clickUsingButton(loginBtn);
	}

}
