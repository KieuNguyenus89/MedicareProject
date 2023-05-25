package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends page.BasePage {

	// page locators
	By signUpBtn = By.xpath("//a[normalize-space()='Sign Up']");
	By loginBtn = By.xpath("//a[normalize-space()='Login']");

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void clickSignUpMenu() {
		clickUsingButton(signUpBtn);

	}

	public void clickLoginpMenu() {
		clickUsingButton(loginBtn);

	}

}
