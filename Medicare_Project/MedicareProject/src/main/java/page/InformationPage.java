package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InformationPage extends BasePage {
	By selectBtn = By.xpath("//a[normalize-space()='Select']");

	public InformationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void clickSelectShippingAddress() {
		clickUsingButton(selectBtn);
	}

}
