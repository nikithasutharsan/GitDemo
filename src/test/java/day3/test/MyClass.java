package day3.test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import day3.pages.HomePageClass;
import day3.pages.LoginPageClass;
import day3.pages.LoginPageClassPageFactory;
import day3.pages.RegisterPageClass;
import jdk.jfr.internal.Logger;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class MyClass {
	WebDriver driver;
	HomePageClass hp;
	RegisterPageClass rpc;
	LoginPageClassPageFactory lp;
	ExtentSparkReporter sparkReporter;
	ExtentReports report;
	ExtentTest logger;
	
  @Test(enabled=true, priority=1)
  public void f() {
	  
	  logger=report.createTest("Register Test Case");
	  //registration
	  hp.click_register();
	  logger.log(Status.INFO,"Navigated to Register page" );
	  rpc.click_gender();
	  rpc.type_firstname("nikitha");
	  rpc.type_lastname("sutharsan");
	  rpc.type_email("nikitha123@gmail.com");
	  rpc.type_password("niki@123");
	  rpc.type_cnfpswd("niki@123");
	  rpc.click_register();
	  logger.log(Status.PASS, "Register success");
  }
  
  @Test(priority=2)
  public void loginTest() {
	  logger=report.createTest("Login Test Case");
	  hp.click_login();
	  lp.perform_login("nikitha123@gmail.com", "niki@123");
	  logger.log(Status.PASS, "Login Success");
	  
  }
  
  @Test(priority=3)
	  public void TestCase3() {
	  logger=report.createTest("Test Case 3");
	  logger.log(Status.INFO, MarkupHelper.createLabel("Running TestCase 3", ExtentColor.GREY));
	  driver.get("https://lkmdemoaut.accenture.com/TestMeApp");
	  Assert.assertEquals(driver.getTitle(), "Home"); //passed case
  }
  
  @Test(priority=4)
  public void TestCase4() {
  logger=report.createTest("Test Case 4");
  logger.log(Status.INFO, MarkupHelper.createLabel("Running TestCase 4", ExtentColor.GREY));
  driver.get("https://www.google.com");
  Assert.assertEquals(driver.getTitle(), "MSN"); //Failed case
}
  @Test(priority=5)
  public void TestCase5() {
  logger=report.createTest("Test Case 5");
  logger.log(Status.INFO, MarkupHelper.createLabel("Running TestCase 5", ExtentColor.GREY));
  driver.get("https://in.yahoo.com");
  //Skipped test case
  throw new SkipException("Intentionally skipping this test case for demo purpose");
}
  
  //This Aftermethod will be executed after each testxase
  @AfterMethod
  public void afterMethod(ITestResult result) throws IOException {
	  if(result.getStatus()==ITestResult.SUCCESS)
	  {
		  logger.log(Status.PASS, MarkupHelper.createLabel("Test Passed -"+result.getName(), ExtentColor.GREEN));
	  }else if(result.getStatus()==ITestResult.SKIP) {
		  logger.log(Status.SKIP, MarkupHelper.createLabel("Test Skipped -"+result.getName(), ExtentColor.AMBER));
	  }else if (result.getStatus()==ITestResult.FAILURE) {
		  logger.log(Status.FAIL, MarkupHelper.createLabel("Test Failed -"+result.getName(), ExtentColor.RED));
		  
		  //Take screenshot is testcase is failed
		  
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  //store it as file
		  File screenshot = ts.getScreenshotAs(OutputType.FILE);
		  String loc="C:\\Softwares\\Screenshot\\"+result.getName()+"Screenshot1.png";
		  FileUtils.copyFile(screenshot, new File(loc));
		  
		  logger.addScreenCaptureFromPath(loc);
	  }
	  }
  
  @BeforeClass
  public void beforeClass() {
	  
	//launching browser
	  System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  //report
	  sparkReporter=new ExtentSparkReporter("C:\\softwares\\screenshot\\MyReport.html");
	  report=new ExtentReports();
	  report.attachReporter(sparkReporter);
	  //open application
	  driver.get("http://demowebshop.tricentis.com/");
	  hp=new HomePageClass(driver);
	  rpc=new RegisterPageClass(driver);
	  //lp=new LoginPageClass(driver);
	  lp= PageFactory.initElements(driver,LoginPageClassPageFactory.class);
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  report.flush();//without this line report will not be generated
  }

}
