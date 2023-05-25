package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends BasePage {
	By checkoutBtn = By.xpath("//a[normalize-space()='Checkout']");

	public CheckOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void clickCheckOut() {
		clickUsingButton(checkoutBtn);
	}

}
