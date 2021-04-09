package lec23_java_selenium_use_of_actions_class;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

/*

Question: How To Perform Double Click Action In Selenium WebDriver?
Answer: We use doubleClick() method of the Actions class in Selenium WebDriver to do Double Click action.

 * */
 


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Actions actions = new Actions(driver);
		WebElement dc =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		actions.doubleClick(dc).build().perform();
		//Switch to the alert box and click on OK button
		Alert alert = driver.switchTo().alert();
		System.out.println("\nAlert Text:" +alert.getText());
		alert.accept();
		driver.quit();
	
	}

}
