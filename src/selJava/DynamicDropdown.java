package selJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//xpath for MMA- //a[@value='MAA']
		//xpath for BLR- //a[@va;ue='BLR]
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//if we dont wanna use the number indexes in code
		//parent child relationship xpath where we can put the xpath of the parent(entire dropdownbox) give a space and xpath of the element
		//when we put parent xpath, it will search the element only inside the parent and restricts the search
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		
		

	}

}
