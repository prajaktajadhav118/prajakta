package testNGannotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("beforeMethod Annotation",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("after method Annotation",true);
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("afterClass Annotation",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("beforeTest Annotation",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("afterTest Annotation",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("beforeSuite Annotation",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("afterSuite Annotation",true);
  }
@Test
public void testMethod() {
	Reporter.log(" test Annotation",true);
}
}
