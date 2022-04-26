package Tutorial;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		System.setProperty( "webdriver.chrome.driver","D:\\skillup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//max our window
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/drag-drop.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		 * WebElement a =
		 * driver.findElement(By.xpath("//span[normalize-space()='Draggable n°1']"));
		 * WebElement b = driver.findElement(By.xpath("(//div[@id='mydropzone'])[1]"));
		 * 
		 * int x = b.getSize().getWidth(); int y = b.getSize().getHeight();
		 * System.out.println(x+"and"+y); Actions act = new Actions(driver);
		 * Thread.sleep(2000); //actions.dragAndDrop(a, b).perform();
		 * //actions.dragAndDropBy(b, x, y).perform(); act.clickAndHold(a)
		 * .pause(Duration.ofSeconds(2)) .moveByOffset(x, y).click()
		 * .pause(Duration.ofSeconds(2) .pause(Duration.ofSeconds(2)) .build()
		 * .perform();
		 */
           WebElement LocatorFrom = driver.findElement(By.xpath("//span[normalize-space()='Draggable n°1']"));
           WebElement LocatorTo = driver.findElement(By.xpath("(//div[@id='mydropzone'])[1]"));
           JavascriptExecutor js = (JavascriptExecutor)driver;
           js.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
                        + "event.initCustomEvent(typeOfEvent,true, true, null);\n" + "event.dataTransfer = {\n" + "data: {},\n"
                        + "setData: function (key, value) {\n" + "this.data[key] = value;\n" + "},\n"
                        + "getData: function (key) {\n" + "return this.data[key];\n" + "}\n" + "};\n" + "return event;\n"
                        + "}\n" + "\n" + "function dispatchEvent(element, event,transferData) {\n"
                        + "if (transferData !== undefined) {\n" + "event.dataTransfer = transferData;\n" + "}\n"
                        + "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n"
                        + "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n" + "}\n"
                        + "}\n" + "\n" + "function simulateHTML5DragAndDrop(element, destination) {\n"
                        + "var dragStartEvent =createEvent('dragstart');\n" + "dispatchEvent(element, dragStartEvent);\n"
                        + "var dropEvent = createEvent('drop');\n"
                        + "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
                        + "var dragEndEvent = createEvent('dragend');\n"
                        + "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n"
                        + "var source = arguments[0];\n" + "var destination = arguments[1];\n"
                        + "simulateHTML5DragAndDrop(source,destination);", LocatorFrom, LocatorTo);
        	}
           
      
		
		

	}


