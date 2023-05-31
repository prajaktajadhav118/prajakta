package dyanamicScreenshot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG {
  private By driver;

@BeforeTest
  public void property()
  {
	  System.setProperty("wbddriver.chrome.driver", "./drivers.chromeDriver.exe");
	   }
  
  @BeforeTest
  public void setUp() {
}
  {
  ChromeDriver driver = new ChromeDriver();
  driver.manage().window();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
  driver.get("\"https://www.selenium.dev/downloads/");
  String actuallLoginPageTitle;
  String (actuallLoginPageTitle=driver.getTitle());
  //apply soft assert
  SoftAssert sa=new SoftAssert();
  Object actualLoginPageTitle = "i don't know";
  sa.assertEquals(actualLoginPageTitle,"heeeeeeello");
  }
  @Test
  public void login()
  {
	  driver.findElements(By.name("username")).sendkeys("admin");
	  driver.findElements(By.name("pwd")).sendkeys("manager");
	
}

private void String(String string) {
	// TODO Auto-generated method stub
	
}
}
