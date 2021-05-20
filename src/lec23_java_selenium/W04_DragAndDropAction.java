package lec23_java_selenium;

import org.openqa.selenium.By;

/*
To see the demo => http://demo.guru99.com/test/drag_drop.html
To learn more => https://www.guru99.com/drag-drop-selenium.html
Question: How To Perform Drag And Drop Action in Selenium WebDriver?*****
Answer: We use dragAndDrop() method of the Actions class in Selenium WebDriver to Perform Drag And Drop action.

 * */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W04_DragAndDropAction {
	@Test
	public void dragAndDropAction() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(10000);
		// Element which needs to drag.
		WebElement sourceLocator = driver.findElement(By.xpath("//*[@id='credit2']/a"));

		// Element on which need to drop.
		WebElement targetLocator = driver.findElement(By.xpath("//*[@id='bank']/li"));

		// Using Action class for drag and drop.
		Actions actions = new Actions(driver);

		// Dragged and dropped.
		actions.dragAndDrop(sourceLocator, targetLocator).build().perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
