package practicals_selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		GlobalVariables gb=new GlobalVariables();
		WebDriver driver= gb.LaunchBrowser();
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		 Thread.sleep(3000);
		 TakesScreenshot ts=(TakesScreenshot)driver;
		   File SCR=ts.getScreenshotAs(OutputType.FILE);
		   File Target=new File("C:\\Users\\L164551\\Desktop\\Automation\\TCS Selenium workspace\\MyFisrtSel\\testoutput\\result.png");
		   FileUtils.copyFile(SCR,Target);
	driver.quit();
	}

}
