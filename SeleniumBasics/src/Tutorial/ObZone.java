package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObZone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty( "webdriver.chrome.driver","D:\\skillup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//max our window
		 driver.manage().window().maximize();
		 driver.get("https://selenium.obsqurazone.com/index.php");
		 driver.findElement(By.xpath("//a[@href='simple-form-demo.php']")).click();
		 driver.findElement(By.cssSelector("a[href='check-box-demo.php']")).click();
		 //driver.findElement(By.xpath("//input[@type='checkbox']")).getSize();
		 //System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		 //(//form[@method='POST'][last()])[2]//input[@type='checkbox']
		 System.out.println(driver.findElements(By.xpath("(//form)[2] //input[@type='checkbox']")).size());
	}

}
