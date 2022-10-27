package qa.com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.com.TestBase.TestBaseClass;

public class LoginPage extends TestBaseClass {

	
	public LoginPage() {
		
		
	PageFactory.initElements(driver, this);	
		
	}
	// object Repo
	
	@FindBy(xpath="//button[@id='dt_login_button']")
	private WebElement Logn_btn;
	

	@FindBy(xpath="//input[@id='txtEmail']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='txtPass']")
	private WebElement pass;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement Sub_mt;
	
	
	public void clickOnLognbt() {
		
		Logn_btn.click();	
	}
	
      public void enterEmail(String ema_il) {
		
    	  email.sendKeys(ema_il);	
	}
	
      public void enterPassword(String pass_word) {
  		
    	  pass.sendKeys(pass_word);	
  	}
	
      public void ClickSubmitbtn() {
  		
    	  Sub_mt.click();	
  	}
	
      public String getTitle() {
    	  
    	  
    	  String title = driver.getTitle();
    	  return title;
      }
	
	
	
	
	
}
