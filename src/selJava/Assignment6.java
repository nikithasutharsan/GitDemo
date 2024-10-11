package selJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//div[@id='checkbox-example']//label[3]/input")).click();
		String name= driver.findElement(By.xpath("//div[@id='checkbox-example']//label[3]")).getText();
		
		WebElement dropdown= driver.findElement(By.id("dropdown-class-example"));
		Select s1= new Select(dropdown);
		s1.selectByVisibleText(name);
		
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		
		String text= driver.switchTo().alert().getText().split(" ")[1].split(",")[0];
		System.out.println(text);
		
		if(text.equalsIgnoreCase(name)) {
			System.out.println("Alert message is success");
		}
		else {
			System.out.println("Alert message failed");
		}
		
		

	}

}
