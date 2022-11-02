package qa.com.testLayer;

import org.testng.annotations.Test;

import qa.com.TestBase.TestBaseClass;

public class DashboardTest extends TestBaseClass {
	
	@Test
	public void DashTest() throws InterruptedException {
		
		dash.ClickOnFullScreen();
		dash.ClickOnexitScreen();
		Thread.sleep(2000);
		dash.ClickOnmin_utes();
		dash.cleardefaultStockQunty();
		Thread.sleep(2000);
		dash.EnterStockQunty("5");
		dash.ClickOnPayout();
		dash.cleardefaultamount();
		dash.cleardefaultamount();
		Thread.sleep(2000);
		dash.enterAmount("25");
		dash.clickOnRise();
		Thread.sleep(2000);
		dash.clickOnSell();
		dash.clickOnReports();
		dash.clickOnProfitsReports();
		Thread.sleep(2000);
		dash.clickOncalender();
		Thread.sleep(2000);
		dash.clickOnThirtydates();
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
