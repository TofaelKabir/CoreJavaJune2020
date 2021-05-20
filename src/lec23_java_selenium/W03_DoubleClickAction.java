package lec23_java_selenium;


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
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W03_DoubleClickAction {
	@Test	
	public void doubleClickAction() throws InterruptedException {
		// one way
		//WebDriverManager.chromedriver().setup();
		//2nd way
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/eclipse-workspace/CoreJavaJune2020/drivers/chromedriver");
		//3rd way
		// System.setProperty("webdriver.driver.chrome", System.getProperty("user.dir")+"/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Actions actions = new Actions(driver);
		WebElement dc =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		actions.doubleClick(dc).build().perform();
		//Switch to the alert box and click on OK button
		Alert alert = driver.switchTo().alert();
		System.out.println("\nAlert Text:>>> " +alert.getText());
		alert.accept();
		driver.quit();
		
		
		
	
	}

}

/*
To download Selenium: https://www.selenium.dev/downloads/
check version of chrome in your device.

direct to drivers folder, and paste=>    chmod +x chromedriver
https://stackoverflow.com/questions/47306190/mac-osx-illegalstateexception-the-driver-is-not-executable

 * */
