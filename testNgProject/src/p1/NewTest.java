package p1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("TEst Executed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Open Test Application");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Close Application");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Open Chrome");
  }

  @AfterClass
  public void afterClass() {
  System.out.println("Close Chrome");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Sign IN");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Sign OUT");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Chrome Setup");
  }

  @AfterSuite
  public void afterSuite() {
  System.out.println("Close Driver and Clean up cookies");
  }
  

}
