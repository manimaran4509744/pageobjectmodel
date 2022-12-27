package versin;

import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


import io.github.bonigarcia.wdm.WebDriverManager;
import versin.HomePage;

public class HomeTestCase1 {
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6000,TimeUnit.SECONDS);
	}

	@Test
	public void loginTest() {
		HomePage homepage = new HomePage(driver);
		boolean actualResult = homepage.login();
		Assert.assertTrue(actualResult);
	}
	@AfterSuite
	public void tearDown() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
}
