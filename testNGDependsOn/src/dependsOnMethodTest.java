import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethodTest {
  @Test(alwaysRun = true)
  public void f1() {
	  System.out.println("f1 -> Fail Method");
	  Assert.assertEquals(true,true);
  }
  @Test(dependsOnMethods = {"f1"})
  public void f2() {
	  System.out.println("f2 -> Pass Method");
	  Assert.assertTrue(true);
  }
  @Test(groups = {"G1"})
  public void f3() {
	  System.out.println("f3 -> Fail Method");
	  Assert.assertTrue(false);
  }
  @Test(groups = {"G1"})
  public void f4() {
	  System.out.println("f4 -> Pass Method");
  }
  @Test(groups = {"G1"})
  public void f5() {
	  System.out.println("f5");
  }
}
