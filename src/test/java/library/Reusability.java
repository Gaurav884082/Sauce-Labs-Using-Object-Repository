package library;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class Reusability {
	public static void capturedscreenshots(WebDriver driver, String ScreenShotName) throws Exception {
		
		 try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			 File source = ts.getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(source, new File("./ScreenShots/" + ScreenShotName +".png"));
		 }
		
		 catch (Exception e) {
			 System.out.println("Exception While Taking Screen Shot" + e.getMessage());
			
			
		 }
	}
}
