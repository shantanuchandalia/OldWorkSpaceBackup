import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterWithXML {
  @Test
  @Parameters({"myName", "mySal"})
  public void f(@Optional("Kanika")String m1, int m2) {
	Assert.assertTrue((m1.equals("Kanika")) && m2 >10000);
  }
}
