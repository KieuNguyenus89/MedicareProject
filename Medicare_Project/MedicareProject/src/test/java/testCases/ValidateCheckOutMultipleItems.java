package testCases;

import org.testng.annotations.Test;

public class ValidateCheckOutMultipleItems extends BaseTest {

	@Test
	public void checkOutMultipleItem() throws InterruptedException {
		homePage.clickLoginpMenu();
		loginPage.loginUser();
		productPage.addMultiItem();
		checkOutPage.clickCheckOut();
		informationPage.clickSelectShippingAddress();
		paymentPage.fillPaymentDetails();

		System.out.println("Checkout mutiple items successfully");

	}

}
