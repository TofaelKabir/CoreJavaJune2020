package lec23_java_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C01_FindElementVsFindElements {
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
	
	// Use of findElement
	@Test(priority = 1)
	public void findElementTest() throws InterruptedException {		
		WebElement aboutUs = driver
				.findElement(By.xpath("//a[@class='hidden-xs dropdown' and contains(text(),'About Us')]"));
		System.out.println(aboutUs.getText());
	}
	
	// Use of findElements
	@Test(priority = 2)
	public void FindElementsTest(){
		List<WebElement> list = driver.findElements(
				By.xpath("//span[contains(text(),'About Us')]//following-sibling::div[@class='menu-content']//a"));
		int totalCount = list.size();
		System.out.println(totalCount);
		for (int i = 0; i < totalCount; i++) {
			System.out.println(list.get(i).getText());
		}
		
	}

}
