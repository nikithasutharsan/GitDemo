package selJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class frameTestTest {
	
  @Test
  public void frame() {
	  WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		Actions a = new Actions(driver);
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
  }


	@Test
	public void dynamicdropddown() throws InterruptedException {
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
	
	@Test
	public void basicAmazon() throws InterruptedException {
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
	}
	
	@Test
	public void checkbox() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//u1[@class=\"dropdown-menu\"]")).sendKeys("BLR");
	}
	
	}