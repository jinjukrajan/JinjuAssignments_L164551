package practicals_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase2_eAcademy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebElement eAcademyLink;
		WebElement Login;
		WebElement MyLearning;
		WebElement MyLearningHistory;
		GlobalVariables gb=new GlobalVariables();
		WebDriver driver= gb.LaunchBrowser();
		 eAcademyLink=driver.findElement(By.xpath(gb.eAcademy));
		 if(eAcademyLink.isDisplayed()) {
			 System.out.println(" eAcademy Link is displayed properly ");
			 eAcademyLink.click();
			 System.out.println(" eAcademy Link has been clicked");
		 }
		
		 else
			 System.out.println("eAcademy link is not enabled or dispalyed");
		 
		 Login=driver.findElement(By.xpath(gb.eAcademy_Login));
		 if(Login.isEnabled()) {
			 Login.click();
			 System.out.println("Clicked on Login button successfully");
		 }
		 else {
			 System.out.println(" Login button is not enabled");
		 }
		 Thread.sleep(2000);
		 Set<String>xs=driver.getWindowHandles();
		   Iterator <String> ID=xs.iterator();
		   String Pwindow=ID.next();
		   String Cwindow=ID.next();
		   Thread.sleep(3000);
		   driver.switchTo().window(Cwindow);
		  
		 MyLearning=driver.findElement(By.xpath(gb.eAcademy_MyLearning));
		 MyLearningHistory=driver.findElement(By.xpath(gb.eAcademy_MyLearingHistory));
		 Actions act=new Actions(driver);
		   act.moveToElement(MyLearning).moveToElement(MyLearningHistory).click().perform();
		   Thread.sleep(2000);
		   String Title=driver.getTitle();
		   System.out.println(Title);
		   if(Title.equalsIgnoreCase("My Learning History - eAcademy")) {
			   System.out.println("eAcademy Mylearning History screen has been loaded successfully.Title is " +Title );
		   }  
			   else
				   System.out.println(" Something went wrong. Couldnt load eAcademy Mylearning History  screen properly");

		   
		 driver.quit();
	}

}
