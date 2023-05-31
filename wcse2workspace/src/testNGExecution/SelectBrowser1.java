package testNGExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectBrowser1 {
	
  @Test
  @Prameters({"browser","url"})
  public void method1(String browser) {
			if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().
  }
	  }
  }
  
  
