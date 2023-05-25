package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected static WebDriver driver2;
	protected static WebDriverWait wait;

	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		driver2 = driver;
	}

	protected void clearElement(By element) {
		driver2.findElement(element).clear();
	}

	protected void clickElement(By element) {
		driver2.findElement(element).click();
	}

	protected void setText(By element, String textToType) {
		driver2.findElement(element).clear();
		driver2.findElement(element).sendKeys(textToType);
	}

	protected String getText(By element) {
		return driver2.findElement(element).getText();
	}

	protected boolean isElementPresent(By element) {
		wait = new WebDriverWait(driver2, 60);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("element")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("element")));
		return driver2.findElement(element).isDisplayed();
	}

	protected ArrayList<String> getAllTextsByElement(By element) {
		ArrayList<String> results = new ArrayList<>();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		List<WebElement> webElements = driver2.findElements(element);

		for (WebElement item : webElements) {

			results.add(item.getText());
		}

		return results;
	}

	protected String getCurrentPageUrl() {
		return driver2.getCurrentUrl();
	}

	protected void clickUsingButton(By element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver2;
		// executor.executeScript("arguments[0].click();", element);
		executor.executeScript("arguments[0].click();", driver2.findElement(element));

	}

	// Function to return the modified string
	static String extractInt(String str) {
		// Replacing every non-digit number
		// with a space(" ")
		str = str.replaceAll("[^0.1-9]", " "); // regular expression

		// Replace all the consecutive white
		// spaces with a single space
		str = str.replaceAll(" +", " ");

		if (str.equals(""))
			return "-1";

		return str;
	}

	public void waitforElement(By element) {
		wait = new WebDriverWait(driver2, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("element")));

	}

}