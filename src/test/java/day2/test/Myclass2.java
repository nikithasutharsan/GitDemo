package day2.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utility.screenshot;

public class Myclass2 {
	WebDriver driver;
  @Test
  public void f() throws IOException, InterruptedException {
	  Actions act = new Actions(driver);
	  
	  //switch to frame
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	  
	  WebElement source=driver.findElement(By.id("draggable"));
	  WebElement target=driver.findElement(By.id("droppable"));
	  
	  //act.dragAndDrop(source, target).perform();
	  
	  act.clickAndHold(source).release(target).build().perform();
	  
		/*
		 * //Screenshot capture TakesScreenshot ts=(TakesScreenshot)driver; //store it
		 * as file File screenshot = ts.getScreenshotAs(OutputType.FILE); File loc=new
		 * File("C:\\Softwares\\Screenshot\\screenshot1.png");
		 * FileUtils.copyFile(screenshot, loc);
		 */
	  screenshot.takeScreenshot(driver);
	  
	  //generate alert through javascript
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("alert('done with drag and drop');");
	  
	  Thread.sleep(2000);
	  
	  //return the title of the page
	  String title=js.executeScript("return document.title;").toString();
	  System.out.println("Title is :"+title);
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  //launching browser
	  System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  //open application
	  driver.get("https://jqueryui.com/droppable/");
	  
  }
  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
}
