package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	// 
  @Test(description="Login Method")
  public void method1() {
	  Reporter.log("Login performed!!",true);
  }
  @Test(description="CreateUser Test Case",dependsOnMethods="method1")
  public void method2() {
	  Reporter.log("user created!!",true);
	  
  }
  @Test(description="Logout Test Case",dependsOnMethods="method2")
  public void method3() {
	  Reporter.log("Logout User!!",true);
  }
}
