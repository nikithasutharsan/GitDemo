package selJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//u1[@class=\"dropdown-menu\"]")).sendKeys("BLR");
		

	}

}
