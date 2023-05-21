package operationalMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main1(String[] args) {
		
	}
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("file:///C:/Users/Shree/Desktop/selenium%20data/webelements/singleselect.html");
			WebElement dropDownElement=driver.findElement(By.id("i1"));
			Select sel=new Select(dropDownElement);
			//Operation methods
			System.out.println(sel.isMultiple());
			driver.navigate().to("");

	}

}
