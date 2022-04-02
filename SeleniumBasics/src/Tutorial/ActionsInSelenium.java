package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsInSelenium {
	
	//MoveToElement=MoveHover
	//DoubleClick
	//Context click=RightClick  home work
	//drag and drop home work
	@Test
	public void ActDemo() throws InterruptedException
	{
		System.setProperty( "webdriver.chrome.driver","D:\\skillup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class*='_2KpZ6l']")).click();
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("Mobile");
		driver.findElement(By.xpath("(//img[@title='Flipkart'])[1]")).click();
		Thread.sleep(4000);
		Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"))).perform();
			act.moveToElement(driver.findElement(By.linkText("Cameras & Accessories"))).perform();
			act.moveToElement(driver.findElement(By.linkText("DSLR & Mirrorless"))).click().perform();
			act.doubleClick(driver.findElement(By.name("q"))).perform();
		//act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Electronics')]")))
		//.moveToElement(driver.findElement(By.linkText("Cameras & Accessories")))
		//.perform();
		//build().perform();
		//can execute this only with build();
		//driver.findElement(By.className("xtXmba"))
		
		
	}

}
