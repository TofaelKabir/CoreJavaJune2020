package lec23_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A01_ClickAWebElement {
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

	@Test(priority = 1)
	public void homepageLoginButtonTest01() {
		driver.findElement(By.id("cms-login-submit")).click();
	}
	
	@Test(priority = 2)
	public void homepageLoginButtonTest02() {
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", homepageLoginButton);
	}

	@Test(priority = 3)
	public void homepageLoginButtonTest03() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('cms-login-submit').click();");
	}
	
//	It is an equivalent of focusing that element and hitting RETURN/ENTER on that element
	@Test(priority = 4)
	public void homepageLoginButtonTest04() {
		driver.findElement(By.id("cms-login-submit")).sendKeys(Keys.RETURN);
	}

	@Test(priority = 5)
	public void homepageLoginButtonTest05() {
		Actions actions = new Actions(driver);
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.click(homepageLoginButton).perform();
	}

	@Test(priority = 6)
	public void homepageLoginButtonTest06() {
		Actions actions = new Actions(driver);
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.moveToElement(homepageLoginButton).click().perform();
	}

	@Test(priority = 7)
	public void homepageLoginButtonTest07() {
		Actions actions = new Actions(driver);
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.clickAndHold(homepageLoginButton).release().perform();
	}

	@Test(priority = 8)
	public void homepageLoginButtonTest08() {
		Actions actions = new Actions(driver);
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.sendKeys(homepageLoginButton, Keys.RETURN).perform();
	}
	
//	The library JavascriptLibrary has been removed from Selenium 3. so, not using it anymore
	
//	@Test(priority = 9)
//	public void homepageLoginButtonTest09() {
//		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
//		JavascriptLibrary jsLib = new JavascriptLibrary(); 
//		 jsLib.callEmbeddedSelenium(driver,"triggerMouseEventAt", homepageLoginButton,"click", "0,0");
//	}

}
