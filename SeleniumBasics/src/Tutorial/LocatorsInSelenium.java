package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsInSelenium {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty( "webdriver.chrome.driver","D:\\skillup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//max our window
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		WebElement username = driver.findElement(By.name("txtUsername"));
		username.click();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).click();
		//for css selector when id is given tagname#id
		driver.findElement(By.cssSelector("input#txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("admin1234");
		//login buttoin using name
		//driver.findElement(By.name("Submit")).click();
		//login button using class name
		//for css selector when class name is given Css selector=tagname.classname
		//driver.findElement(By.cssSelector("input.button")).click();
		driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
		//driver.findElement(By.id("welcome")).click();
		//driver.close();
		//Thread.sleep(3000);
		//logout
	     //driver.findElement(By.linkText("Logout")).click();
		//driver.findElement(By.cssSelector("span#spanMessage")).getText();
		System.out.println(driver.findElement(By.cssSelector("span#spanMessage")).getText());
		driver.findElement(By.partialLinkText("password?")).click();
		Thread.sleep(3000);
		//indexing
		driver.findElement(By.cssSelector("input[name*='security']:nth-child(2)")).click();
		driver.findElement(By.cssSelector("input[name*='security']:nth-child(2)")).sendKeys("Admin");
		//Regular expression
		driver.findElement(By.cssSelector("input[value*='Reset']")).click();
	      //Tagname
		System.out.println(driver.findElement(By.cssSelector("div h1")).getText());
		// Xpath
        driver.findElement(By.xpath("//input[@class='cancel']")).click();
        //indexing using xpath
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[contains(@value,'LO')]")).click();
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
			
		
	}

}







/*
 * NOTES ABOUT LOCATORS
 * 
 * Different formats of identifying elements in the UI using Xpath's.. hope this
 * helps !!
 * 
 * Relative Xpath:
 * 
 * 1. Attribute Based xpath //tagName[@attribute='atribute value']
 * //input[@id='username'] //input[@type='password']
 * 
 * 2. Using Multiple Attribute //tagName[@attribute1='atribute1
 * value'][@attribute2='atribute2 value'] //tagName[@attribute1='atribute1
 * value' and @attribute2='atribute2 value']
 * 
 * //input[@class='inputLogin'][@type='text'] //input[@class='inputLogin'
 * and @type='text123'] //input[@class='inputLogin' or @type='text123']
 * 
 * 3. Text based xpath //tagName[text()='text value'] //h2[text()='Leaftaps
 * Login']
 * 
 * 4. Using partial match //tagName[contains(text(),'partial text value')]
 * //h2[contains(text(),'Leaftaps')]
 * 
 * //tagName[contains(@attribute,'partial attribute value')]
 * //label[contains(@for,'user')]
 * 
 * 5. Collection Based xpath: (xpath) (//input)[2]
 * 
 * (//input[@class='inputLogin'])[2]
 * 
 * Axes (Relationship) Based Xpath =================================
 * 
 * 6. Parent to Child (Use single slash)
 * 
 * xpath of Parent/tagName of the child //form[@id='login']/p
 * //form[@id='login']/p[3] //form[@id='login']/p[@class='top']
 * 
 * 7. Child to Parent
 * 
 * xpath for Child/parent::tagName of parent
 * 
 * //label[text()='Password']/parent::p
 * 
 * xpath for Child/.. //label[text()='Password']/..
 * 
 * 8. GrandParent to GrandChild(use //)
 * 
 * xpath for GrandParent//tagName of GrandChild //form[@id='login']//label
 * (//form[@id='login']//label)[2]
 * 
 * 9. GrandChild to GrandParent
 * 
 * xpath for GrandChild/ancestor::TagName of GrandParent
 * 
 * //input[@id='username']/ancestor::form
 * 
 * xpath for GrandChild/../.. //input[@id='username']/../..
 * 
 * 10. Elder Sibling to younger sibling (top to bottom : following)
 * ----------------------------------------------- xpath for elder
 * sibling/following-sibling::tagName of younger sibling
 * //label[text()='Username']/following-sibling::input
 * 
 * 11. Younger Sibling to Eldersibling (bottom to top : preceding)
 * ----------------------------------------------- xpath for younger
 * sibling/preceding-sibling::tagName of eldersibling
 * //input[@type='password']/preceding-sibling::label
 * 
 * 12. Elder Cousin to Younger Cousin (top to bottom : following)
 * --------------------------------------------------- xpath for Elder
 * cousin/following::tagName of Younger Cousin
 * //input[@type='text']/following::input
 * 
 * 13. Younger Cousin to Elder Cousin (bottom to top : preceding)
 * --------------------------------------------------- xpath for Younger
 * cousin/preceding::tagName of Elder Cousin
 * 
 * //input[@type='password']/preceding::input
 */