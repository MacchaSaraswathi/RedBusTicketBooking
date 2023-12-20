package Red.Bus.Ticket.Booking;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Bus.ticket.booking.test.framework.Xls_DataProvider;
import Red.Bus.Ticket.Booking.HomePage;
import TestBase.TestBase;


public class TestRegisterPage extends TestBase  {
	
HomePage hp;
RegisterPage rp;
	@BeforeMethod
	public void OpenApp()
	{
		openBrowser();
		hp = new HomePage(driver);
		rp = new RegisterPage(driver);
	}
	
	
	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}
	
	
	@Test(priority='1', dataProvider="testdata")
	public void testregisterUser(String name,String lname,String email,String ph,String password,String cpasswd) throws InterruptedException
	{
		hp.clickonMyAccount();
		hp.clickonRegister();
		rp.regirsteruser(name,lname,email,ph,password,cpasswd);
	}
	
	@DataProvider(name="testdata")
	public Object[][] datasupplier() throws EncryptedDocumentException, IOException
	{
		
		Object[] [] input = Xls_DataProvider.getTestData("Sheet1");
		return input;
		
	}
	

}


