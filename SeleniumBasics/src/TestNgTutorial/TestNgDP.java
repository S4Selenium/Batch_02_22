package TestNgTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDP {
	
	@Test(dataProvider="getlogin")
	public void Login( String Username, String Password) throws InterruptedException
	{
	// TODO Auto-generated method stub
	System.setProperty( "webdriver.chrome.driver","D:\\skillup\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	WebElement username = driver.findElement(By.name("user-name"));
	username.click();
	driver.findElement(By.name("user-name")).sendKeys(Username);
	driver.findElement(By.cssSelector("input#password")).click();
	driver.findElement(By.id("password")).sendKeys(Password);
	driver.findElement(By.cssSelector("input[value='Login']")).click();
	driver.findElement(By.id("react-burger-menu-btn")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	}
@DataProvider
public Object[][] getlogin()
	{
	Object[][] data = new Object[2][2];
	    data[0][0]="standard_user";
	    data[0][1]="secret_sauce";
	    data[1][0]="problem_user";
	    data[1][1]="secret_sauce";
	    return data;
	    
	}

}


