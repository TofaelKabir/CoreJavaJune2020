package lec23_java_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.security.AbstractUserAuthentication;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class X02_AuthenticationPopUp2 {
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver",
//				"/Users/mohammadsharkar/eclipse-workspace/CoreJavaJune2020/drivers/chromedriver");
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
//		Thread.sleep(5000);
//		Alert alert = driver.switchTo().alert();
////Selenium-WebDriver Java Code for entering Username & Password as below:
//		driver.findElement(By.id("userID")).sendKeys("admin");
//		driver.findElement(By.id("password")).sendKeys("admin");
//		driver.switchTo().alert().accept();
//		driver.switchTo().defaultContent();
//		driver.quit();
//	}
//}
	
	
	
	

// https://www.tutorialspoint.com/how-to-handle-authentication-popup-with-selenium-webdriver-using-java
// https://www.edureka.co/community/47896/different-handling-authentication-popup-window-selenium

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadsharkar/eclipse-workspace/CoreJavaJune2020/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String userName = "admin";
		String password = "admin";
		String url = "https://the-internet.herokuapp.com/basic_auth";
		driver.get(url);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void signIncheckAlert() {
// that alert is can't be inspected, so can't use Alert option or send keys option, need to discuss with Nasir bhai
	}
}