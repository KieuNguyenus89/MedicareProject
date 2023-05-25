package testCases;

import org.testng.annotations.Test;

public class ValidateSignUpandLoginForUserAcc extends BaseTest {

	@Test(priority = 1)
	public void validateSignUpUser() throws InterruptedException {
		homePage.clickSignUpMenu();
		signUpPage.signUpUser();
		System.out.println("User sign up successfully");

	}

	@Test(priority = 2)

	public void validateLoginUser() throws InterruptedException {
		homePage.clickLoginpMenu();
		loginPage.loginUser();
		System.out.println("User login successfully");

	}

}
