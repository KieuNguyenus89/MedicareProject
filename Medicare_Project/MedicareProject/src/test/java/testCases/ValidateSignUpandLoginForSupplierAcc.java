package testCases;

import org.testng.annotations.Test;

public class ValidateSignUpandLoginForSupplierAcc extends BaseTest {

	@Test(priority = 1)
	public void validateSignUpSupplier() throws Exception {

		homePage.clickSignUpMenu();
		signUpPage.signUpSupplier();
		Thread.sleep(10000);
		System.out.println("Supplier sign up successfully");

	}

	@Test(priority = 2)
	public void validateLoginSupplier() throws Exception {
		homePage.clickLoginpMenu();
		loginPage.loginSupplier();
		System.out.println("Supplier login successfully");

	}

}
