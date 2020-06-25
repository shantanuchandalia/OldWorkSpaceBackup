
import org.testng.*;

public class TestListenerClass implements ITestNGListener
{
	public void onTestStart(ITestResult result)
	{
		System.out.println("onTestStart" + result.getTestName() + " : " + result.getStatus());
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("onTestSuccess" + result.getTestName() + " : " + result.getStatus());
	}
}