package lec23_java_selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Y01_SwitchMethods_Windows {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadsharkar/eclipse-workspace/CoreJavaJune2020/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void switchWindows() throws InterruptedException {
		String mainWindow = driver.getWindowHandle();
		System.out.println("Main Window ID: " + mainWindow + "\n");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)");

		driver.findElement(By.id("windowButton")).click();

		// Get all window handles
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("Windows Open After Click: " + allWindowHandles.size());

		//Extract Parent and child window handle from all window handles
		String window1 = (String) allWindowHandles.toArray()[0];
		String window2 = (String) allWindowHandles.toArray()[1];

		//	Use window handle to switch from one window to other window
		driver.switchTo().window(window2);

	}
}
