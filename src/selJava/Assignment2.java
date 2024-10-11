package selJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("//input[@minlength=\"2\"]")).sendKeys("Nikitha");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("niki123@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("niki123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement gender= driver.findElement(By.id("exampleFormControlSelect1"));
		Select option=new Select(gender);
		option.selectByIndex(1);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("19950829");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		

	}

}
