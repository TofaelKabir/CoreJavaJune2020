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

public class B01_InputTextInTextBox {
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

	// "Search" any item by clicking "Search" button from webPage
	// although it is failing, because search field disappear after writing anything
	
	@Test(enabled = true, priority = 1)
	public void testSearchItem1() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Sneakers");
		driver.findElement(By.xpath("//div[@class='search-icon___1MZ8G']")).click();

	}
	
	// "Search" any item by clicking "Enter" button from keyboard
	@Test(enabled = true, priority = 2)
	public void testSearchItem2() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Sneakers", Keys.ENTER);

	}

	// Use of clear method, code copied from top one
	@Test(enabled = false, priority = 3)
	public void testSearchItem3() {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Sneakers", Keys.ENTER);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).clear();

	}
	
	@Test(enabled = true, priority = 4)
	public void testSearchItem4() throws InterruptedException {
		WebElement searchField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement submitButton = driver.findElement(By.xpath("//input[@tabindex='0' and @type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='macbook air'", searchField); //to send keys
		Thread.sleep(5000);
		js.executeScript("arguments[0].click()", submitButton); //to do click
		Thread.sleep(5000);

	}
	
	//need to fix it
	@Test(enabled = true, priority = 5)
	public void testSearchItem5() throws InterruptedException {
//		WebElement searchField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		WebElement submitButton = driver.findElement(By.xpath("//input[@tabindex='0' and @type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("document.getElementById('lalu').value = 'lalmia';");
		Thread.sleep(5000);
		js.executeScript("document.getElementById('cms-login-submit').click();");
		Thread.sleep(5000);

	}

}



