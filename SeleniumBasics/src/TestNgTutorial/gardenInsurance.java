package TestNgTutorial;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//The @Ignore annotation has a higher priority than individual @Test method annotations. When @Ignore is placed on a class, all the tests in that class will be disabled.
@Ignore
public class gardenInsurance {
	@Test
	public void WebLoginGarden()
	{
		System.out.println("garden Insurance WebLogin");
	}
	@Test
	public void MobileLoginGarden()
	{
		System.out.println("garden Insurance MobileLogin");
	}
	@Test
	public void MobileLogoutGarden()
	{
		System.out.println("garden Insurance MobileLogOut");
	}
	@Test
	public void MobileHomeGarden()
	{
		System.out.println("garden Insurance MobileHome");
	}
	
	@Test
	public void APILoginGarden()
	{
		System.out.println("garden Insurance APILogin");
	}
}
