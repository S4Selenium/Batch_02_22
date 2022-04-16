package Tutorial;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotforSelenium {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty( "webdriver.chrome.driver","D:\\skillup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//max our window
		driver.manage().window().maximize();
		driver.get("https://www.qabible.in/payrollapp/");
		driver.findElement(By.id("loginform-username")).click();
		driver.findElement(By.id("loginform-username")).sendKeys("carol");
		driver.findElement(By.id("loginform-password")).click();
		driver.findElement(By.id("loginform-password")).sendKeys("1q2w3e4r");
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Invoice")).click();
		driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-paperclip']")).click();
		Thread.sleep(3000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_S);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
