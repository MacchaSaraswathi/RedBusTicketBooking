package Red.Bus.Ticket.Booking;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Red.Bus.Ticket.Booking.SearchPage;
import TestBase.TestBase;


public class TestSearchPage extends TestBase  {
	SearchPage sp;
	@BeforeMethod
	public void OpenApp()
	{
		openBrowser();
		sp = new SearchPage(driver);
	}
	
	
	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}
	
	@Test
	public void searchProduct() throws InterruptedException
	{
		sp.searchproduct();
		Thread.sleep(1000);
		sp.selectproduct();
	}
	
	
	
	
	
	
	
	
	
	
	
	



}


