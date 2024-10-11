package selJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca/");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("halloween costume");	
		Thread.sleep(6000);
		List<WebElement> search= driver.findElements(By.cssSelector(".left-pane-results-container .s-suggestion"));
			for(WebElement s:search) {
				if(s.getText().equalsIgnoreCase("halloween costume toddler")) {
					s.click();
					break;
				}
		}
			
			driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Spooktacular Creations']")).click();
			driver.findElement(By.xpath("//div[@data-asin=\"B075BP8LWV\"]")).click();
			
			Select s1= new Select(driver.findElement(By.id("native_dropdown_selected_size_name")));
			s1.selectByValue("2,B075BN84WP");			
			
			
			driver.close();
		

	}

}
