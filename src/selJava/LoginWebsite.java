package selJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWebsite {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("nikitha");
		driver.findElement(By.name("inputPassword")).sendKeys("nikitha123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Niki");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("niki123@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9876543210");
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("Niki");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		

	}

}
