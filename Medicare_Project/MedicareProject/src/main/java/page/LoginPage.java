package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	By username = By.xpath("//input[@id='username']");
	By password = By.xpath("//input[@id='password']");
	By loginBtn = By.xpath("//input[@value='Login']");

	String UsernameSupplier = "supplier2@gmail.com";
	String UsernameUser = "user2@gmail.com";
	String Password = "123";

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void loginSupplier() {
		setText(username, UsernameSupplier);
		setText(password, Password);
		clickElement(loginBtn);
	}

	public void loginUser() {
		setText(username, UsernameUser);
		setText(password, Password);
		clickElement(loginBtn);

	}

}
