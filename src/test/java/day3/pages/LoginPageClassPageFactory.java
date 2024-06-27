package day3.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageClassPageFactory {
WebDriver driver;
	
	@FindBy(name="Email") public WebElement email;
	@FindBy(id="Password") public WebElement pswd;
	@FindBy(xpath="//input[@value='Log in']") public WebElement logbutton;
	
	//constructor
	public LoginPageClassPageFactory(WebDriver driver) {
		this.driver=driver;
	}
	
	//methods
	public void perform_login(String m, String lp) {
		email.sendKeys(m);
		pswd.sendKeys(lp);
		logbutton.click();
	}


}
