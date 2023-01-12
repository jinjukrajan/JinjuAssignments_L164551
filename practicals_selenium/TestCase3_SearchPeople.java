package practicals_selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3_SearchPeople {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebElement SearchPeople;

		GlobalVariables gb=new GlobalVariables();
		WebDriver driver= gb.LaunchBrowser();
		Robot rb=new Robot();
		driver.get(gb.url);
		 
		 SearchPeople=driver.findElement(By.xpath(gb.search));
		 if(SearchPeople.isEnabled()) {
			 SearchPeople.sendKeys(gb.searchTxt); 
			 rb.keyPress(KeyEvent.VK_ENTER);
			 rb.keyRelease(KeyEvent.VK_ENTER);
			 Thread.sleep(3000);
			 String CurrentURL=driver.getCurrentUrl();
			 System.out.println(CurrentURL);
			 if((CurrentURL.equalsIgnoreCase(gb.ActualUrl1))||(CurrentURL.equalsIgnoreCase(gb.ActualUrl2))) {
				 System.out.println("Page has been loaded successfully with the details of " +gb.searchTxt);
			 }
			 else {
				 System.out.println(" There is some issue with the details loaded");
			 }
			 
			 String Title=driver.getTitle();
			   System.out.println(" Current page Title on search of " +gb.searchTxt+ " is : " +Title);
			  
		 }
		 else {
			 System.out.println("Textbox is not enabled for search");
		 }
		 
		driver.quit(); 
	}

}
