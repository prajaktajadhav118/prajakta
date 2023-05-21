package handleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByValuemethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubthrows InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/Shree/Desktop/selenium%20data/webelements/singleselect.html");
		WebElement dropDownElement=driver.findElement(By.id("i1"));
		Select sel=new Select(dropDownElement);
		sel.selectByIndex(3);
		Thread.sleep(10);
		sel.deselectByVisibleText("10");

	}

}
