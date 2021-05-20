package lec23_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A02_ClickAWebElement {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadsharkar/eclipse-workspace/CoreJavaJune2020/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mountsinai.org/");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	@Test (priority = 1)
	   public void clickAWebElementTest01(){
	       driver.findElement(By.xpath("//a[normalize-space(text())='Find a Doctor' and @class = 'hidden-xs dropdown']")).click();
	   }
	
	@Test (priority=2) 
	   public void clickAWebElementTest02(){
		WebElement findADoctor = driver.findElement(By.xpath("//a[normalize-space(text())='Find a Doctor' and @class = 'hidden-xs dropdown']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", findADoctor);
	   }


}
