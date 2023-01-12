package practicals_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase1_Clarity_Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		GlobalVariables gb=new GlobalVariables();
		WebDriver driver= gb.LaunchBrowser();
	    WebElement Clarity=driver.findElement(By.xpath(gb.Claritylink));
		//scroll till clarity link
	     JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView();", Clarity);
		 Thread.sleep(3000);
		 System.out.println("Successfully found Clarity link");
		 //click clarity link
		 Clarity.click();
		 Thread.sleep(3000);
		 //get the child windowhandle
		 Set<String>xs=driver.getWindowHandles();
		   Iterator <String> ID=xs.iterator();
		   String Pwindow=ID.next();
		   String Cwindow=ID.next();
		   Thread.sleep(3000);
		   driver.switchTo().window(Cwindow);
		   String Title=driver.getTitle();
		   System.out.println(Title);
		   if(Title.equalsIgnoreCase("CA PPM :: Overview: General"))
			   System.out.println("SUCCESS:Clarity screen loaded properly.Page Title is " +Title );
		   
		   else
			   System.out.println(" Something went wrong. Couldnt load Clarity screen properly");
		 driver.quit();
	}

}
