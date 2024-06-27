package day3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageClass {
	
	WebDriver driver;
	
	//All elements in the home page
	By registerlink=By.linkText("Register");
	By login=By.linkText("Log in");
	By searchbox=By.name("q");
	
	//constructor to initalise webdriver
	public HomePageClass(WebDriver driver) {
		this.driver=driver;
	}
	
	//create reusuable methods
	public void click_register() {
		driver.findElement(registerlink).click();
	}
	
	public void click_login() {
		driver.findElement(login).click();
	}
	
	public void click_Search(String s) {
		driver.findElement(searchbox).sendKeys(s);
	}
}


