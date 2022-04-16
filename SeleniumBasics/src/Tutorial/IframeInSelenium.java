package Tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			// TODO Auto-generated method stub
			System.setProperty( "webdriver.chrome.driver","D:\\skillup\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
	

}
}
//Different ways to get into iframe
	//ID,NAME,INDEX,WEBELEMENT