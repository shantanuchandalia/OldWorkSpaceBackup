import org.testng.annotations.DataProvider;

public class EmployeeData {
	 @DataProvider(name ="Employee Data")
	  public static Object[][] empData()
	  {
		  return new Object[][] {{"Shantanu",10000, "Pune"},{"Kanika", 10001, "Pune"},{"asdf",100, "asdf"}};
	  }
}
