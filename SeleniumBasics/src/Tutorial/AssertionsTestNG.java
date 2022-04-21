package Tutorial;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsTestNG {
	
	//Assertions
	//Assert.assertEquals(Actual, Expected);
	//Hard Assert:- If given, and the assert fails following lines won't be executed.
	//Soft Assert:-If assert is given and the assert is failed the below lines will be executed.
	//SoftAssert obj = new SoftAssert();
	//obj.assertEquals(Actual, Expected)
	//obj.AssertAll();
	
	@Test(priority=1)
	public static void testLogin()
	{
		
		System.out.println("URL");
		Assert.assertEquals(true, true);//Hard Assert
		System.out.println("username");
		System.out.println("password");
		Assert.assertEquals(true, true);
		System.out.println("click");
	
	}
	@Test(priority=2)
	public void testEmpDetails()
	{
		SoftAssert Sassert = new SoftAssert();
		System.out.println("Fname");
		System.out.println("LName");
		Sassert.assertEquals(false,true);//soft assert
		System.out.println("AlterName");
		System.out.println("Designation");
		Sassert.assertAll();//Assertion fail
	}

}
