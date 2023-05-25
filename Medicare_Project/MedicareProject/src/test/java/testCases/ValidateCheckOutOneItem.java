package testCases;

import org.testng.annotations.Test;

public class ValidateCheckOutOneItem extends BaseTest {

	@Test
	public void checkOutOneItem() {
		homePage.clickLoginpMenu();
		loginPage.loginUser();

		productPage.addOneItem();
		checkOutPage.clickCheckOut();
		informationPage.clickSelectShippingAddress();
		paymentPage.fillPaymentDetails();
		System.out.println("Checkout one item successfully");

	}

}
