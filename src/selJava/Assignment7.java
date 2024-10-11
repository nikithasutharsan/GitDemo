package selJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
List<WebElement> rows= driver.findElements(By.cssSelector(".table-display tr"));
	System.out.println("number of rows:"+rows.size());
	
	List<WebElement> columns=driver.findElements(By.cssSelector(".table-display th"));
	System.out.println("number of columns:"+columns.size());
	
	for(int i=0; i<rows.size();i++) {
		
		if(i==2) {
			System.out.println(rows.get(i).getText());
			
		}
	}
		
				}

}
