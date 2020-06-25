import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListenerClass.class)
public class basicTest {
  @Test(priority = -1, groups = {"G1"})
  public void FirstTest() {
	  String s = "Shantanu";
	  Assert.assertEquals("Shantanu",s);
  }
  @Test(priority = 2, groups = {"G1","G2"})
  public void SecondTest() {
	  String s = "Shantanu2";
	  Assert.assertEquals("Shantanu2",s);
  }
  @Test(priority = 1, groups = {"G2"})
  public void ThirdTest() {
	  String s = "Shantanu3";
	  Assert.assertEquals("Shantanu3",s);
  }
  @Test(priority = 3)
  public void FourthTest() {
	  String s = "Shantanu4";
	  Assert.assertEquals("Shantanu4",s);
  }
  
}
