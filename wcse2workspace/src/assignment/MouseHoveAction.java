package assignment;

		import java.time.Duration;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class MouseHoveAction {
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				 WebDriver driver=new ChromeDriver();
				 driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				 driver.get("https://www.bluestone.com/");
				 Thread.sleep(2000);
				 driver.findElement(By.id("denyBtn")).click();
				 
				 WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Watch J')]"));
				 
				 Thread.sleep(2000);
				 
				   Actions act = new Actions(driver);
				   Thread.sleep(2000);
				   // to pefrom mouseHover action
				   act.moveToElement
				   (target).build().perform();
				   Thread.sleep(2000);
				   driver.findElement(By.xpath("//a[.='Band']")).click();
				   Thread.sleep(2000);
			}
		}
		