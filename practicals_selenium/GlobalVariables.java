package practicals_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlobalVariables {

	public static final String driverPath="C:\\Users\\L164551\\Desktop\\seljars\\exe\\chromedriver.exe";
	public static final String  url="https://intranet.westpacgroup.com.au/wbg/home"; 
	public static final String  Claritylink="//a[text()=\"Clarity\"]";
	 
	 public static final String eAcademy="//*[@id=\"content\"]/main/div/div/div/div[1]/div/div/div/div[1]/div/ul/li[2]/a";

	 public static final String eAcademy_Login="//a[text()=\"Log in\"]";
	 
	 public static final String eAcademy_MyLearning="/html/body/div/header/section[2]/div/div[1]/nav/ul/li[3]/a/span";

	 public static final String eAcademy_MyLearingHistory="//a[text()=\"My Learning History\"]";
	 public static final String search="//input[@id=\"newPDQuery\"]";
	 public static final String searchTxt="Jinju Rajan";
	 public static final String ActualUrl1="https://pdir.btfin.com/PeopleDirectory/v2#/colleague/L164551?singleResult=true";
	 public static final String ActualUrl2="https://pdir.btfin.com/PeopleDirectory/v2#/home?for=employee&firstName=Jinju&lastName=Rajan";
	 
	 WebDriver driver;
	 public WebDriver LaunchBrowser() throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver",driverPath);
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(url);
			 Thread.sleep(5000);
		 return driver;
	 }
}
