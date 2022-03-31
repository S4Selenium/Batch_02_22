package Tutorial;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting the driver path
		System.setProperty( "webdriver.gecko.driver","D:\\skillup\\geckodriver.exe");
		//Calling Chrome Driver
		WebDriver driver=new FirefoxDriver();
		//ChromeDriver driver = new ChromeDriver();
		//navigation to google using get_method
		driver.get("https://www.google.co.in/");
		//driver.getTitle();
	     System.out.println(driver.getTitle());
	     //driver.getCurrentUrl();
	     System.out.println(driver.getCurrentUrl());
		//driver.navigate().to("https://www.google.co.in/");
		//driver.close();
		 driver.quit();
	    // driver.resetInputState();
		// firefox and edge class has no knowledge of this
	    	
	}

}
