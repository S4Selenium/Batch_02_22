package Tutorial;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flightbooking {
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty( "webdriver.chrome.driver","D:\\skillup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//max our window
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(By.xpath("(//span[@class='bui-tab__text'])[2]")).click();
		driver.findElement(By.xpath("//div[@data-testid='searchbox_controller_trip_type_ONEWAY']")).click();
		//driver.findElement(By.xpath("//div[@aria-label='Where from?']")).click();
		//driver.findElement(By.xpath("//div[@aria-label='Where from?']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("Chennai");
		driver.findElement(By.className("css-1tl2oa1")).sendKeys("Delhi");
		driver.findElement(By.className("css-bwf0ll")).click();
		driver.findElement(By.className("Text-module__root--variant-headline_1___2W9ql")).click();
		/*
		 * List<WebElement> options= driver.findElements(By.className("css-qqvbcw"));
		 * for(WebElement option:options) { if(option.getText().equalsIgnoreCase("MAA"))
		 * { option.click(); } }
		 */
		
		driver.findElement(By.xpath("//input[@placeholder='Depart']")).click();
		//driver.findElement(By.className("css-g0pg3f-SearchboxInput")).click();
		driver.findElement(By.cssSelector("span[data-date-cell$='2022-04-25']")).click();
		driver.findElement(By.className("InputCheckbox-module__field___1mRcZ")).click();
		WebElement search =driver.findElement(By.xpath("(//button[normalize-space()='Search'])[1]"));
		search.click();
		search.click();
		

}
}
