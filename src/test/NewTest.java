package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("username")).sendKeys("ketakidhotre2272001");
		driver.findElement(By.id("password")).sendKeys("ketakidhotre2272001");
		driver.findElement(By.id("login")).click();
		String actualTitle= driver.getTitle();
		Assert.assertEquals("Adactin.com - Search Hotel", actualTitle);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://adactinhotelapp.com");
  }

  @AfterTest
  public void afterTest() {
  }

}
