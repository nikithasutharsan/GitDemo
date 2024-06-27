package day1.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class MyClass1 {
	WebDriver driver;
  @Test
  public void f() {
	  //Click on Register
	  driver.findElement(By.linkText("Register")).click();
	  //select gender
	  driver.findElement(By.id("gender-female")).click();
	  //enter first name
	  driver.findElement(By.name("FirstName")).sendKeys("Nikitha");
	  //enter last name
	  driver.findElement(By.name("LastName")).sendKeys("Sutharsan");
	  //enter email id
	  driver.findElement(By.name("Email")).sendKeys("niki@gmail.com");
	  //enter password
	  driver.findElement(By.name("Password")).sendKeys("password123");
	  //enter confirm password
	  driver.findElement(By.name("ConfirmPassword")).sendKeys("password123");
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
