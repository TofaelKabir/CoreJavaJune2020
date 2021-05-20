package lec23_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class X01_AuthenticationPopUp {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadsharkar/eclipse-workspace/CoreJavaJune2020/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String userName = "admin";
		String password = "admin";
		// adding username, password with URL
		String url = "https://" + userName + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(url);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void authenticationPopUpTest() throws InterruptedException {
		Thread.sleep(5000);
		// identify and get text after authentication of popup
		String t = driver.findElement(By.cssSelector("p")).getText();
		System.out.println("Text is: " + t);
	}
}

// https://www.tutorialspoint.com/how-to-handle-authentication-popup-with-selenium-webdriver-using-java
// https://www.edureka.co/community/47896/different-handling-authentication-popup-window-selenium