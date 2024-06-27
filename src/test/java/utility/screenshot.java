package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {
	
	public static void takeScreenshot(WebDriver driver) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		  //store it as file
		  File screenshot = ts.getScreenshotAs(OutputType.FILE);
		  File loc=new File("C:\\Softwares\\Screenshot\\"+timestamp()+"screenshot1.png");
		  FileUtils.copyFile(screenshot, loc);
	}
	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}
