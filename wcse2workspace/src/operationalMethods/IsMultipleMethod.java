package operationalMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {

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
		driver.navigate().to("file:///C:/Users/Shree/Desktop/selenium%20data/webelements/multiselect.html");
		WebElement dropDownElement1=driver.findElement(By.id("i1"));
		Select sel1=new Select(dropDownElement1);
		//Operation methods
		System.out.println(sel1.isMultiple());
		sel.selectByIndex(3);
		Thread.sleep(1000);

	}

}
