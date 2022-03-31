package TestNgTutorial;

import org.testng.annotations.Test;

public class VehicleInsurance {
	
	@Test(groups = {"Reg"})
	public void WebLoginVehicle()
	{
		System.out.println("Vehicle Insurance WebLogin");
	}
	@Test(groups = {"Reg"})
	public void WebLogoutVehicle()
	{
		System.out.println("Vehicle Insurance WebLogout");
	}
	@Test
	public void MobileLoginVehicle()
	{
		System.out.println("Vehicle Insurance MobileLogin");
	}
	@Test
	public void APILoginVehicle()
	{
		System.out.println("Vehicle Insurance APILogin");
	}
	
	
}
