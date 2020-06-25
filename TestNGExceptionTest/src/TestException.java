import org.testng.Assert;
import org.testng.annotations.Test;

public class TestException {
	
  @Test(expectedExceptions = {NullPointerException.class, ArithmeticException.class} )
  public void f() {
	  classException e = new classException();
	  e.check();
  }
}
