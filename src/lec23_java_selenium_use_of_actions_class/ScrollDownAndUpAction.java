package lec23_java_selenium_use_of_actions_class;

import org.openqa.selenium.Keys;

/*
To learn more => https://www.toolsqa.com/selenium-webdriver/mouse-hover-action/
Info: A mouse hover is also called as hover. Mouse hover action is basically an action where a user places a mouse over a designated area like a hyperlink. It can cause some event to get triggered.
 
Question: How to do mouse hover (hover over)/move to element on a web element using WebDriver?
Answer: By using Actions class and the method is .moveToElement().build().perform();

 
 * */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDownAndUpAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mountsinai.org/");
		Actions actions = new Actions(driver);
		// Scroll Down using Actions class
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		Thread.sleep(4000);
		// Scroll Up using Actions class
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		Thread.sleep(4000);
		driver.quit();

	}

}
