package TestNgTutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeInsurance {
	
	
	
	@Test(priority=-3,groups = {"Reg"})
	public void WebLoginHome()
	{
		System.out.println("Home Insurance WebLogin");
	}
	@Test(priority=3,groups= {"Reg"})
	public void WebLogoutHome()
	{
		System.out.println("Home Insurance WebLogout");
	}
	@Test(priority=-2)
	public void MobileLoginHome()
	{
		System.out.println("Home Insurance MobileLogin");
	}
	//enabled=false won't pick that particular method
	@Test(enabled=false)
	public void APILoginHome()
	{
		System.out.println("Home Insurance APILogin");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("I am going to execute last from suite level");
	}
	@BeforeClass
	public void beforesuite()
	{
		System.out.println("I am going to execute before each Class");
	}

}

