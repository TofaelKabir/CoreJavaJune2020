package lec23_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class V02_SelectByValue {
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

	@Test
	 
	   public void selectByValueTest(){
		   // click Find A Doctor, click Select specialty
		   // Use of normalize-space to remove white space
	       driver.findElement(By.xpath("//a[normalize-space(text())='Find a Doctor' and @class = 'hidden-xs dropdown']")).click();
	       Select select = new Select(driver.findElement(By.xpath("//select[@name='specialty' and @aria-label='speciality_label' ]")));
	       select.selectByValue("Alzheimer's Disease");
	   }


}
