package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NotificationPopUp
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public static void openapplication() throws InterruptedException
	{
	 //  ChromeOptions option = new ChromeOptions();	
	   //option.addArguments("--disable-Notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.get("http://www.myntra.com");
	   WebElement es = driver.findElement(By.xpath("(//a[text()='Essentials'])[1]"));
	  Actions ac = new Actions(driver);
	  ac.moveToElement(es).perform();
	  driver.findElement(By.xpath("//a[text()='Bath & Body']")).click();
	    
	  /*WebDriverWait wait = new WebDriverWait(driver,40);
	   WebElement text = driver.findElement(By.xpath("(//div[contains(.,'KEEP IN TOUCH')])[7]"));
	  wait.until(ExpectedConditions.elementToBeSelected(text));
	   int ya = text.getLocation().getY();
	  Thread.sleep(2000);
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("windows.scrollTo(0,"+ya+")");
	    */
	}
}
