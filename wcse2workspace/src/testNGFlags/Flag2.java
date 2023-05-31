package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	//method or Annotaion is enabled or disabled
  @Test(enabled= true,description="Login Method")
  public void method2() {
	  Reporter.log("Login Performed!!");
  }
  @Test(enabled=true,description="Logout Method")
  public void method3() {
  Reporter.log("Logout Performed!!");
  
  }
}
