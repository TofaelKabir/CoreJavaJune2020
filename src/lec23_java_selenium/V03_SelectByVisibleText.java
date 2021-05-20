package lec23_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class V03_SelectByVisibleText {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadsharkar/eclipse-workspace/CoreJavaJune2020/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void selectByVisibleTextTest() {
		driver.get("https://www.amazon.com/");
		WebElement webElement = driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
		Select select = new Select(webElement);
		select.selectByVisibleText("Alexa Skills");
		

	}
}

//select[@aria-label='hospital']