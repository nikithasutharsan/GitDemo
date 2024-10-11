package selJava;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Invoking browser
		//Chrome browser- ChromeDriver class - Call Methods
		//We need to create object for the class to access the methods
		//Interface called WebDriver
		//step to invoke chrome driver
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\venur\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","path");
		//System.setProperty("webdriver.edge.driver","path");
		//using selenium manager here
		WebDriver driver= new ChromeDriver();
		
		// Firefox:WebDriver driver= new FirefoxDriver();
		//Edge: WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com");
		//to check the title
		System.out.println(driver.getTitle());
		//to show the url
		System.out.println(driver.getCurrentUrl());
		//close the window
		driver.close();
		//quit
		//driver.quit();
		
		
	}

}
