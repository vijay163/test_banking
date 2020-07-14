package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileDownLoad
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	@Test
	public static void openapplication() throws InterruptedException, AWTException
	{
	 //  ChromeOptions option = new ChromeOptions();	
	   //option.addArguments("--disable-Notifications");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.get("http://www.seleniumhq.org");
	    driver.findElement(By.xpath("//a[text()='Downloads']")).click();
	    WebElement text = driver.findElement(By.xpath("//h2[text()='Selenium Client & WebDriver Language Bindings']"));
	   int ya = text.getLocation().getY();
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("window.scrollTo(0,"+ya+")");
	    driver.findElement(By.xpath("//td[text()='Java']/../td[6]/a[1]")).click();
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
	}
}
