import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {

  @Test(dataProvider = "Employee Data", dataProviderClass = EmployeeData.class)
  public void f(String name, int sal, String city) {
	  
	  System.out.println("Name : "+name);
	  System.out.println("Sal: "+ sal);
	  System.out.println("City: " + city);
  }
}
