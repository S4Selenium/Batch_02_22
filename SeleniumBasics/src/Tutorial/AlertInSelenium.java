package Tutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty( "webdriver.chrome.driver","D:\\skillup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	     //Thread.sleep(3000);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
	     //This is inside Iframe so need to switch into iframe first
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		String alertmsg =driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		driver.switchTo().alert().sendKeys("Selenium");
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@id='getwebsitebtn']")).click();
	    //Making some changes to commit via git Bash
		
	}

}
