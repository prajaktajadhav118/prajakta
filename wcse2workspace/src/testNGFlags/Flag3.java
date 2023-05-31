package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
	// use to execute annotation or method multipal time!!
  @Test(invocationCount=4)
  public void method1() {
	  Reporter.log("Login Test Case!!");
  }
}
