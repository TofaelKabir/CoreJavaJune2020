package lec23_java_selenium;


import org.openqa.selenium.By;

/*
https://www.toolsqa.com/selenium-webdriver/mouse-hover-action/

A mouse hover is also called as hover. Mouse hover action is basically an action where a user places a mouse over a designated area like a hyperlink. It can cause some event to get triggered.
 
Question: How to do mouse hover (hover over)/move to element on a web element using WebDriver?
Answer: By using Actions class and the method is .moveToElement().build().perform();

 
 * */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mountsinai.org/");
		Actions builder = new Actions(driver);
		WebElement aboutUs = driver.findElement(By.xpath("//a[@class='hidden-xs dropdown' and contains(text(),'About Us')]"));
		Thread.sleep(2000);
		builder.moveToElement(aboutUs).build().perform();
		Thread.sleep(2000);
		System.out.println("\nThe text of this web element is: "+ aboutUs.getText());
		driver.quit();
	
	}

}
