package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AlertPopUP 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public static void openapplication() throws InterruptedException, AWTException
	{
	 //  ChromeOptions option = new ChromeOptions();	
	   //option.addArguments("--disable-Notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
        driver.get("http://localhost/login.do");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.xpath("//a[text()='Login']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='Settings']/..")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
	    Thread.sleep(2000);
	   /* driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Thread.sleep(2000);
	   Alert al = driver.switchTo().alert();
	   String t = al.getText();
	  al.accept();
	   System.out.println(t);
	*/
	    String photo = "C:\\Users\\Admin\\Pictures\\Screenshots\\Screenshots(1)";
	     driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
	     WebElement file = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
	    Actions ac = new Actions(driver);
	     ac.doubleClick(file).perform();
         /* Robot r = new Robot();
          Thread.sleep(2000);
          r.keyPress(KeyEvent.VK_CANCEL);
	      Thread.sleep(2000);
	      r.keyPress(KeyEvent.VK_CANCEL);
	   */
	     Thread.sleep(2000);
	     file.sendKeys(photo,Keys.ENTER);
	   
	
	}
	
}
