package Tutorial;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class ActionsInSelenium {

	// MoveToElement=MoveHover
	// DoubleClick
	// Context click=RightClick home work
	// drag and drop home work
	@Test
	public <T> void ActDemo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\skillup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		// implicitWait

		// driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// ExplicitWait
		// WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(5))
		// .until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class*='_2KpZ6l']")));
		// firstResult.click();

		  //Fluent wait
		  
			/*
			 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			 * .withTimeout(Duration.ofSeconds(30)) .pollingEvery(Duration.ofSeconds(5))
			 * .ignoring(NoSuchElementException.class);
			 * 
			 * WebElement foo = wait.until(new Function<WebDriver, WebElement>(){ public
			 * WebElement apply(WebDriver driver){ return
			 * driver.findElement(By.cssSelector("button[class*='_2KpZ6l']")); } });
			 */
		  //if(foo.isDisplayed())
			/*
			 * { System.out.println("Found"); Thread.sleep(3000); foo.click(); 
			 * 
			 * }
			 */
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//Thread.sleep(3000);
		//driver.findElement(By.cssSelector("button[class*='_2KpZ6l']")).click();
		// firstResult.click();
		// WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		// w.until(ExpectedConditions.visibilityOf((WebElement)
		// By.cssSelector("button[class*='_2KpZ6l']")));
		try {
		    WebElement button = driver.findElement(By.cssSelector("button[class*='_2KpZ6l']"));
		            button.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			WebElement button = driver.findElement(By.cssSelector("button[class*='_2KpZ6l']"));
		            button.click();
		}
	    
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("Mobile");
		driver.findElement(By.xpath("(//img[@title='Flipkart'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Electronics']")).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Mi']"))).click().perform();
		// act.moveToElement(driver.findElement(By.linkText("Cameras &
		// Accessories"))).perform();
		// act.moveToElement(driver.findElement(By.linkText("DSLR &
		// Mirrorless"))).click().perform();
		// act.doubleClick(driver.findElement(By.name("q"))).perform();
		// act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Electronics')]")))
		// .moveToElement(driver.findElement(By.linkText("Cameras & Accessories")))
		// .perform();
		// build().perform();
		// can execute this only with build();

	}

}
//Jsexecuotor click, scroll
//Interface

//Maven
