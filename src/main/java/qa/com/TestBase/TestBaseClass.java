package qa.com.TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import qa.com.PageLayer.DashboardPage;
import qa.com.PageLayer.LoginPage;

public class TestBaseClass {
	
public static WebDriver driver;
public LoginPage login;
public DashboardPage dash;
public JavascriptExecutor js;
	
	
	@BeforeMethod
	
	public void setupBrowser() {
		
		String br="chrome";
		
		if(br.equalsIgnoreCase("chrome")) {
			
		WebDriverManager.chromedriver().setup();
		
         driver=new ChromeDriver();
				
		}
		

		else if(br.equalsIgnoreCase("firefox")) {
			
		WebDriverManager.firefoxdriver().setup();
		
		 driver=new FirefoxDriver();
				
		}

		if(br.equalsIgnoreCase("edge")) {
			
		WebDriverManager.edgedriver().setup();
		
	     driver=new EdgeDriver();
				
		}
		
		driver.get("https://app.deriv.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		
		
		login=new LoginPage();
		login.clickOnLognbt();
		login.enterEmail("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.ClickSubmitbtn();
		dash=new DashboardPage();
	
		
		
		
		
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		
	}
	
	
	
	
	
	
	

}
