package lec23_java_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Move_to_slide {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// Launch the URL
		driver.get("https://jqueryui.com/slider/");
		System.out.println("demoqa webpage Displayed");

		// Maximize browser window
		driver.manage().window().maximize();

		// Adding wait
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		// Instantiate Action Class
		Actions actions = new Actions(driver);
		// Retrieve WebElemnt 'slider' to perform mouse hover
		WebElement slider = driver.findElement(By.id("slider"));
		// Move mouse to x offset 50 i.e. in horizontal direction
		actions.moveToElement(slider, 50, 0).perform();
		Thread.sleep(10000);
		System.out.println("Moved slider in horizontal directions");

		// Close the main window
		driver.close();

	}

}
