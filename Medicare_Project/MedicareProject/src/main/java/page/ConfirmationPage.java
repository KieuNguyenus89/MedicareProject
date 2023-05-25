package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends BasePage {
	By confirmMsg = By.xpath("//h3[normalize-space()='Your Order is Confirmed!!']");
	By itemNameChose1 = By.xpath("//td[normalize-space()='Paracetamol']");
	By itemNameChose2 = By.xpath("//h3[normalize-space()='Combiflame']");
	By itemNameChose4 = By.xpath("//h3[normalize-space()='Aceclofenac']");
	By itemNameChose5 = By.xpath("//h3[normalize-space()='Amoxicillin']");
	By grandTotal = By.xpath("//td[@class='text-right'][contains(text(),'₹ 18.0')]");

	public ConfirmationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public String getConfirmMsg() {
		return getText(confirmMsg);
	}

	public boolean verifyItemName1IsCorrect(String expectedItemName) {

		return isElementPresent(itemNameChose1);

	}

	public boolean verifyItemName2IsCorrect(String expectedItemName) {
		return isElementPresent(itemNameChose2);

	}

	public boolean verifyItemName4IsCorrect(String expectedItemName) {
		return isElementPresent(itemNameChose4);

	}

	public boolean verifyItemName5IsCorrect(String expectedItemName) {
		return isElementPresent(itemNameChose5);

	}

	public Float getFinalPaymentMultipelItem() {
		return Float.valueOf(extractInt(getText(grandTotal)));

	}

	public boolean verifyItemPriceIsCorrect(String expectedItemName) {
		return isElementPresent(grandTotal);
	}

}
