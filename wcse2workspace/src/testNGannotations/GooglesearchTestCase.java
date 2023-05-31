package testNGannotations;

import java.sql.Driver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import handleDropdown.ChromeDriver;
import keyWordDriven.BaseTest;

public class GooglesearchTestCase {
  @Test
  public void search1() {
	  
	  EdgeDriver.switchTo().activeElement().sendKeys("JAVA",Keys.ENTER);
  }
  
  @Test
  public void search2()
  {
	  Driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
  }
  
  @	Test
  public void serach3()
  {
	  ChromeDriver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER); 
	  
  }
}
