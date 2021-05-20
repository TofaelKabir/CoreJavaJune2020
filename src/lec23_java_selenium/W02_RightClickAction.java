package lec23_java_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

/*

Question: How To Perform Right Click Action (Context Click) In Selenium WebDriver?

Answer: We use contextClick() method of the Actions class in Selenium WebDriver to do Right-Click (Context Click) action.

 * */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W02_RightClickAction {
	@Test
	public void rightClickAction() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Actions actions = new Actions(driver);
		WebElement rc = driver.findElement(By.cssSelector(".context-menu-one"));
		actions.contextClick(rc).build().perform();
		// Click on Edit link on the displayed menu options
		WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		element.click();
		// Switch to the alert box and click on OK button
		Alert alert = driver.switchTo().alert();
		System.out.println("\nAlert Text:" + alert.getText());
		alert.accept();
		driver.quit();

	}

}
