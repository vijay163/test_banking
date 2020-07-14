package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Generics.BaseClass;

public class maximize
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public static void openapplication() throws InterruptedException
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		List<WebElement> text = driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
		System.out.println(text.isEmpty());
		final int tx = text.size();
		System.out.println("Links present in the page::::::"+tx);
	
		for( WebElement t:text)
		{
			System.out.println(t.getText());
			Thread.sleep(500);
		}
    	driver.manage().window().setPosition(new Point(0,-500));
		System.out.println("page is successfully minimised:::::");
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("q"));
		for(int i=0;i<text.size();i++)
		{
		search.sendKeys("nokia mobiles");
		search.clear();
		}
		search.sendKeys("downLoad jenkins",Keys.ENTER);
	}

}
