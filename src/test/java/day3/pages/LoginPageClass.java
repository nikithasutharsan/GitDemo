package day3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageClass {
	
	WebDriver driver;
	
	By emailid=By.id("Email");
	By lpswd=By.id("Password");
	By loginbutton=By.xpath("//input[@value='Log in']");
	
	//constructor
	public LoginPageClass(WebDriver driver) {
		this.driver=driver;
	}
	
	//methods
	public void perform_login(String m, String lp) {
		driver.findElement(emailid).sendKeys(m);
		driver.findElement(lpswd).sendKeys(lp);
		driver.findElement(loginbutton).click();
	}

}
