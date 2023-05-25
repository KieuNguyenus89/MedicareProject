package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BasePage {

	By itemNameChose1 = By.xpath("//h3[contains(text(),'Paracetamol')]");
	By itemNameChose2 = By.xpath("//h3[normalize-space()='Combiflame']");
	By itemNameChose4 = By.xpath("//h3[normalize-space()='Aceclofenac']");
	By itemNameChose5 = By.xpath("//h3[normalize-space()='Amoxicillin']");

	By cardNo = By.xpath("//input[@id='cardNumber']");
	By expiryM = By.xpath("//input[@id='expityMonth']");
	By expiryY = By.xpath("//input[@id='expityYear']");
	By cvCode = By.xpath("//input[@id='cvCode']");

	By grandTotal = By.xpath("//h3[contains(text(),'Grand Total - ₹ 18.0/-')]");
	By payBtn = By.xpath("//a[normalize-space()='Pay']");

	String CardNo = "1234567";
	String ExpiryM = "12";
	String ExpiryY = "27";
	String CVCode = "758";

	public PaymentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void fillPaymentDetails() {
		setText(cardNo, CardNo);
		setText(expiryM, ExpiryM);
		setText(expiryY, ExpiryY);
		setText(cvCode, CVCode);
		clickUsingButton(payBtn);
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
