package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\skillup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/?.intl=in");
		//driver.findElement(By.id("persistent")).click();
		//driver.findElement(By.xpath("//input[@id='persistent']")).click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('persistent').click()");
	WebElement Checkbox = driver.findElement(By.xpath("//input[@value='y']"));
	Thread.sleep(3000);
	js.executeScript("arguments[0].click();", Checkbox);
	
			
	
	}

}
//JS is an Interface