package TestNgTutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgPara {
	@Parameters({"URL","Username","password"})
	@Test
	public void demo(String siteurl,String Uname, String pwd)
	{
		System.out.println(siteurl);
		System.out.println(Uname);
		System.out.println(pwd);
	
	}

}
