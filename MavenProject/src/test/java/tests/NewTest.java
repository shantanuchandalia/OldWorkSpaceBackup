package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class NewTest {

	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		ChromeOptions o = new ChromeOptions();
		String [] s = new String[] {"--start-maximized"};//"disable-extensions",

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		o.addArguments(s);
		driver = new ChromeDriver(o);
		driver.get("https://demo.midtrans.com/");
	}

	@Test
	public void f() throws InterruptedException {
		System.out.println(driver.getTitle());
		WebElement btn_buyNow = driver.findElement(By.xpath("//*[@id='container']//a[text()='BUY NOW']"));
		btn_buyNow.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement cart_section = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='cart-section'][1]")));
		String xpath_cust_name = "//*[@id=\"container\"]//div[@class='cart-section'][2]//tr[@class='table-content'][1]/td[2]/input";
		String xpath_cust_email = "//*[@id=\"container\"]//div[@class='cart-section'][2]//tr[@class='table-content'][2]/td[2]/input";
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath_cust_name)))).clear();
		driver.findElement(By.xpath(xpath_cust_name)).sendKeys("Shantanu Chandalia");
		driver.findElement(By.xpath(xpath_cust_email)).clear();
		driver.findElement(By.xpath(xpath_cust_email)).sendKeys("Shantanu.Chandalia@gmail.com"); 
		driver.findElement(By.xpath("//*[@id=\"container\"]//div[@class='cart-section'][2]//tr[@class='table-content'][3]/td[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"container\"]//div[@class='cart-section'][2]//tr[@class='table-content'][3]/td[2]/input")).sendKeys("9999911111");; 
		driver.findElement(By.xpath("//*[@id=\"container\"]//div[@class='cart-section'][2]//tr[@class='table-content'][4]/td[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"container\"]//div[@class='cart-section'][2]//tr[@class='table-content'][4]/td[2]/input")).sendKeys("Pune");
		driver.findElement(By.xpath("//*[@id=\"container\"]//div[@class='cart-section'][2]//tr[@class='table-content'][5]/td[2]/textarea")).sendKeys("Saudagar"); 
		driver.findElement(By.xpath("//*[@id=\"container\"]//div[@class='cart-section'][2]//tr[@class='table-content'][6]/td[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"container\"]//div[@class='cart-section'][2]//tr[@class='table-content'][6]/td[2]/input")).sendKeys("99999"); 
		driver.findElement(By.xpath("//*[@class=\"cart-action\"]/div")).click();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("snap-midtrans"));
		Thread.sleep(4000);
		WebElement Select_payment = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='application']/div[1]/a"))));
		Select_payment.click();	
		Thread.sleep(4000);
		WebElement payment_creditcard = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='payment-list']/div[1]/a"))));
		payment_creditcard.click();
		Thread.sleep(4000);
		WebElement card_no = driver.findElement(By.name("cardnumber"));
		card_no.sendKeys("4811111111111114");
		//WebElement card_expiry = driver.findElement(By.)
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();	
		driver.quit();
	}


}
