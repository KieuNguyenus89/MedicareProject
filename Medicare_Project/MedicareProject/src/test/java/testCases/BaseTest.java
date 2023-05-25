package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.CheckOutPage;
import page.ConfirmationPage;
import page.HomePage;
import page.InformationPage;
import page.LoginPage;
import page.PaymentPage;
import page.ProductPage;
import page.SignUpPage;

public abstract class BaseTest {

	protected static WebDriver driver;

	// object repo
	protected CheckOutPage checkOutPage;
	protected ConfirmationPage confirmationPage;
	protected HomePage homePage;
	protected InformationPage informationPage;
	protected LoginPage loginPage;
	protected PaymentPage paymentPage;
	protected ProductPage productPage;
	protected SignUpPage signUpPage;

	@BeforeMethod(alwaysRun = true)
	protected void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("http://localhost:8080/medicare");

		initializePageObjects();
	}

	public void initializePageObjects() {
		checkOutPage = new CheckOutPage(driver);
		confirmationPage = new ConfirmationPage(driver);
		homePage = new HomePage(driver);
		informationPage = new InformationPage(driver);
		loginPage = new LoginPage(driver);
		paymentPage = new PaymentPage(driver);
		productPage = new ProductPage(driver);
		signUpPage = new SignUpPage(driver);

	}

	@AfterMethod(alwaysRun = true)
	protected void cleanUpActivities() {
		driver.quit();
	}

}
