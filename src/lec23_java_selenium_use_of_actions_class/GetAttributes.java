package lec23_java_selenium_use_of_actions_class;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class GetAttributes {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/Downloads/chromedriver5");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.com/");
//		driver.quit();
//		//Set system properties for geckodriver This is required since Selenium 3.0
//		 System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Toolsqa\\lib\\geckodriver.exe");
//	 
	        // Launch the URL 
	        driver.get("https://demoqa.com/slider/");
	        System.out.println("demoqa webpage Displayed");
	        
	    	//Maximise browser window
		driver.manage().window().maximize();
		    
		//Adding wait 
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	                
	        //Instantiate Action Class        
	        Actions actions = new Actions(driver);
	        //Retrieve WebElemnt 'slider' to perform mouse hover 
	    	WebElement slider = driver.findElement(By.id("sliderValue"));
	    	//Move mouse to x offset 50 i.e. in horizontal direction
	    	Thread.sleep(10);
	    	actions.moveToElement(slider,50,0).perform();
	    	Thread.sleep(10);
	    	slider.click();
	    	System.out.println("Moved slider in horizontal directions");
	    	
	        // Close the main window 
	        driver.close();
		

	}

}
