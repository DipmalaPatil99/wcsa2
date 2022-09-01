package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test()
  public void method1()
  {
	 Reporter.log("method 1",true);
  }
}