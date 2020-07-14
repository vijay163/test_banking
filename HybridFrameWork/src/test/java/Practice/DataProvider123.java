package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class DataProvider123 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	@DataProvider
	public  Object[][] datavalues() throws InterruptedException
	{
		
		Object[][] obj = new Object[4][2];
		
		obj[0][0]="manoj";
		obj[0][1]="kumar";
		
		obj[1][0]="anil";
		obj[1][1]="kumar";
		
		obj[2][0]="rakesh";
		obj[2][1]="kumar";
		
		obj[3][0]="satish";
		obj[3][1]="kumar";
		
		return obj;
		
	}
	public static WebDriver driver;
	@Test(dataProvider = "datavalue")
	@Parameters({"un","pw"})
	public static void openapplication(@Optional("un") String un,@Optional("pw")String pw) throws InterruptedException 
	{
		
		 driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.get("http://localhost/login.do");
	    Thread.sleep(2000);
	    driver.findElement(By.name("username")).sendKeys(un);
	    driver.findElement(By.name("pwd")).sendKeys(pw);
	    System.out.println("un is::::"+un);
	    System.out.println("pw is::::"+pw);
	}
}
