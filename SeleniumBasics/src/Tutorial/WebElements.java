package Tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\skillup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// max our window
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");

		// driver.findElement(By.xpath("(//div/select)[1]")).click();
		//WebElement Sdrop = driver.findElement(By.xpath("(//div/select)[1]"));
		driver.findElement(By.xpath("//a[@href='jquery-select.php']")).click();
		driver.findElement(By.xpath("(//span[@role='presentation'])[1]")).click();
	
		/*
		 * Select dropdown = new Select(Sdrop); // select by index //
		 * dropdown.selectByIndex(2); //selectby value //dropdown.selectByValue("4"); //
		 * select by visible text dropdown.selectByVisibleText("9");
		 */
		
		//We are storing the dynamic drop down options in a list
		List<WebElement> options = driver.findElements(By.xpath("//li[@role='option']"));
		//Iterating through the list
		for(WebElement option:options)
		{    
			//finding the correct match from the list
			if(option.getText().equalsIgnoreCase("Indiana"))
			{
				//clicking on that option
				option.click();
				break;
			}
			
		}
		
	}

}
