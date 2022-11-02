package qa.com.PageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.com.TestBase.TestBaseClass;

public class DashboardPage extends TestBaseClass {
	
public DashboardPage() {
	
	PageFactory.initElements(driver, this);	
}	
//obj Repo
@FindBy(xpath="(//*[@class='dc-icon footer__icon'])[2]")
private WebElement full_Screen;
@FindBy(xpath="(//*[@class='dc-icon footer__icon'])[2]")
private WebElement exit_Screen;
@FindBy(xpath="//button[@id='dc_m_toggle_item']")
private WebElement min_utes;
@FindBy(xpath="//input[@id='dt_simple_duration_input']")
private WebElement insert_qunty;
@FindBy(xpath="//button[@id='dc_payout_toggle_item']")
private WebElement payout;
@FindBy(xpath="//button[@id='dc_stake_toggle_item']")
private WebElement stake;			
@FindBy(xpath="//input[@id='dt_amount_input']")
private WebElement enter_amount;	    
@FindBy(xpath="(//div[@class='btn-purchase__info btn-purchase__info--left'])[1]")
private WebElement Rise;
@FindBy(xpath="(//div[@class='btn-purchase__info btn-purchase__info--left'])[2]")
private WebElement Fall;
@FindBy(xpath="//button[@class='dc-btn dc-btn--secondary dc-btn--sell']")
private WebElement Sell;
@FindBy(xpath="//a[@id='dt_positions_drawer_report_button']")
private WebElement Go_ToReports;
@FindBy(xpath="//input[@id='dt_calendar_input_from']")
private WebElement calender_forms;
@FindBy(xpath="//span[text()='30']")
private WebElement thirtydates; 
@FindBy(xpath="//div[@id='/reports/profit']")
private WebElement profit_Reports;
//actions methods
	
public void ClickOnexitScreen() {
	
	exit_Screen.click();
}	
	
public void ClickOnFullScreen() {
	full_Screen.click();
	
}		
	
public void ClickOnmin_utes() {
	min_utes.click();	
	
}		
public void EnterStockQunty(String stock) {
	insert_qunty.clear();
	insert_qunty.sendKeys(stock);
	
}	
public void cleardefaultStockQunty() {
	insert_qunty.sendKeys(Keys.BACK_SPACE);
	
	
}		
public void ClickOnPayout() {
	
	payout.click();
}		
public void ClickOnStake() {
	
	stake.click();
}		
	
public void enterAmount(String amount) {

	enter_amount.sendKeys(amount);
}
public void cleardefaultamount() {
	enter_amount.sendKeys(Keys.BACK_SPACE);
	
}

public void clickOnRise() {
	Rise.click();
	
}		
public void clickOnFall() {
	
	Fall.click();
}

public void clickOnSell() {
	
	Sell.click();
}
public void Scrolling() {
	js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(131,349)");
	
	
}

public void clickOnReports() {
	
	Go_ToReports.click();
	
}

public void clickOnProfitsReports() {
	
	profit_Reports.click();
	
}

public void clickOncalender() {
	
	calender_forms.click();
	
}
public void clickOnThirtydates() {
	
	thirtydates.click();
	
}












	

}
