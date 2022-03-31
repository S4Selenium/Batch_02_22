package TestNgTutorial;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LifeInsurance {
	@BeforeTest
	public void before()
	{
		System.out.println("I run FIRST for Life Insurance");
	}
	
	@Test(groups = {"Reg"})
	public void WebLoginLife()
	{
		System.out.println("Life Insurance WebLogin");
	}
	@Test(groups = {"Reg"})
	public void WebLogoutLife()
	{
		System.out.println("Life Insurance WebLogout");
	}
	@Test
	public void MobileLoginLife()
	{
		System.out.println("Life Insurance MobileLogin");
	}
	@Test
	public void APILoginLife()
	{
		System.out.println("Life Insurance APILogin");
	}
	@AfterTest
	public void after()
	{
		System.out.println("After all Life Insurance TestCases");
	}
	
}
