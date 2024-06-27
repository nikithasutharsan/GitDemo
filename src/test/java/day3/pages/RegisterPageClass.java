package day3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageClass {
	
	WebDriver driver;
	By gender=By.id("gender-female");
	By firstname=By.id("FirstName");
	By lastname=By.id("LastName");
	By email=By.id("Email");
	By pswd=By.id("Password");
	By cpswd=By.id("ConfirmPassword");
	By registerbutton=By.id("register-button");
	
	//constructor
	public RegisterPageClass(WebDriver driver) {
		this.driver=driver;
	}
	
	//methods
	public void click_gender() {
		driver.findElement(gender).click();
	}
	public void type_firstname(String fn) {
		driver.findElement(firstname).sendKeys(fn);
	}
	public void type_lastname(String ln) {
		driver.findElement(lastname).sendKeys(ln);
	}
	public void type_email(String mail) {
		driver.findElement(email).sendKeys(mail);
	}
	public void type_password(String pwd) {
		driver.findElement(pswd).sendKeys(pwd);
	}
	public void type_cnfpswd(String cpwd) {
		driver.findElement(cpswd).sendKeys(cpwd);
	}
	public void click_register() {
		driver.findElement(registerbutton).click();
	}

}
