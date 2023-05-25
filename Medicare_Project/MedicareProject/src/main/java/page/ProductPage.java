package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {
	// By dropDownMenu = By.xpath("//a[@id='dropdownMenu1']");

	By itemViewBtn1 = By.xpath("//div[3]/div[1]/div[1]/div[1]/a[@href='/medicare/show/1/product']");
	By itemName1 = By.xpath(
			"//div[@ng-repeat='product in pCtrl.mvProducts']//h5[@class='ng-binding'][normalize-space()='Paracetamol']");

	By addToCartBtn = By.xpath("//a[normalize-space()='Add to Cart']");

	By addBtnItem2 = By.xpath("//a[@href='/medicare/cart/add/2/product']");
	By addBtnItem4 = By.xpath("//a[@href='/medicare/cart/add/4/product']");
	By addBtnItem5 = By.xpath("//a[@href='/medicare/cart/add/5/product']");

	By itemName2 = By.xpath("//td[contains(text(),'Combiflame')]");
	By itemName4 = By.xpath("//td[contains(text(),'Aceclofenac')]");
	By itemName5 = By.xpath("//td[contains(text(),'Amoxicillin')]");

	By itemPrice1 = By.xpath(
			"//div[@ng-repeat='product in pCtrl.mvProducts']//h4[@class='pull-right ng-binding'][contains(text(),'₹ 18')]");
	By itemPrice2 = By.xpath("//td[normalize-space()='50']");
	By itemPrice4 = By.xpath("//td[normalize-space()='80']");
	By itemPrice5 = By.xpath("//td[normalize-space()='65']");

	By continueShoppingBtn = By.xpath("//a[normalize-space()='Continue Shopping']");

	private float priceItem2;

	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void addOneItem() {
		clickUsingButton(itemViewBtn1);
		clickUsingButton(addToCartBtn);
	}

	public void addMultiItem() {
		clickUsingButton(itemViewBtn1);
		clickUsingButton(addToCartBtn);
		clickUsingButton(continueShoppingBtn);
		clickUsingButton(addBtnItem2);
		clickUsingButton(continueShoppingBtn);
		clickUsingButton(addBtnItem4);
		clickUsingButton(continueShoppingBtn);
		clickUsingButton(addBtnItem5);
	}

	public String getItemName1() {
		return getText(itemName1);
	}

	public String getItemName2() {
		return getText(itemName2);
	}

	public String getItemName4() {
		return getText(itemName4);
	}

	public String getItemName5() {
		return getText(itemName5);
	}

	public String getIdemPrice1() {
		return getText(itemPrice1);
	}

	public Float getTotalPrice() {
		float priceItem1 = Float.valueOf(extractInt(getText(itemPrice1)));
		float priceItem2 = Float.valueOf(extractInt(getText(itemPrice2)));
		float priceItem4 = Float.valueOf(extractInt(getText(itemPrice4)));
		float priceItem5 = Float.valueOf(extractInt(getText(itemPrice5)));
		float TotalPrice = priceItem1 + priceItem2 + priceItem4 + priceItem5;
		return TotalPrice;

	}

}
