package day2.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Myclass1 {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement search=driver.findElement(By.xpath("//input[@value='Search store']"));
	  search.sendKeys("computer");
	  //Actions
	  Actions act=new Actions(driver);
	  act.moveToElement(search).pause(2000).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	  //verify whether we have moved to build your computer
	  Assert.assertTrue(driver.getTitle().contains("Build your own computer"));
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  //launching browser
	  System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  //open application
	  driver.get("http://demowebshop.tricentis.com/");
	  
  }
  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
