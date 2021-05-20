package lec23_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B02_DisplayVisibilityOrAvailabilityOfAWebElement {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadsharkar/eclipse-workspace/CoreJavaJune2020/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal.cms.gov/portal/");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	// isDisplayed() is the method used to verify the presence of a web element
	// within the web page.
	// Use of isDisplayed()
	
	@Test(enabled = true, priority = 1)
	public void homepageLoginLogoTest() {
		boolean elementDisplayed = driver.findElement(By.id("cms-homepage-login-logo")).isDisplayed();
		System.out.println(elementDisplayed);
	}

	// isEnabled() is the method used to verify if the web element is enabled or
	// disabled within the web page. isEnabled() is primarily used with buttons.
	// Use of isEnabled()
	
	@Test(enabled = true, priority = 2)
	public void homepageLoginButtonTest() {
		boolean elementEnabled = driver.findElement(By.id("cms-login-submit")).isEnabled();
		System.out.println(elementEnabled);
	}

	// isSelected() is the method used to verify if the web element is selectable or
	// not. isSelected() method is predominantly used with radio buttons, dropdowns and checkboxes.
	
	@Test(enabled = true, priority = 3)
	public void homePageCheckboxTest() {
		boolean elementSelected = driver.findElement(By.xpath("//input[@id='checkd']")).isSelected();
		System.out.println(elementSelected);
	}

}
