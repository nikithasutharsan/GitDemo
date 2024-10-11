package selJava;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1.Give the count of links
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2.Get the count of links in footor section
		WebElement footerdriver= driver.findElement(By.id("gf-BIG"));//limiting the driver only to the footersection
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3. get the count only in first column in footer section
		WebElement columndriver= footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));//limiting only to the first column
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//4.Click on each link on column and check if the links are opening// after clicking link it will open new window and it should go back and then do so click back for every link but it will take
		//time so easy method is if we press ctrl and click the link it will open new tab instead of new window no forth and back then windohandle and get text from all tab
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++ ) {
			String clickontab= Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickontab);
			Thread.sleep(5000);
		}//open the tab
		
		Set<String> abc= driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
