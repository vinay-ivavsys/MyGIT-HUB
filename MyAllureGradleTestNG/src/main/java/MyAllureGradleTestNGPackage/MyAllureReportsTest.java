package MyAllureGradleTestNGPackage;
/**
 * 
 */


import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.testng.AllureTestListener;

/**
 * @author SiddhiVinayaka
 *
 */

public class MyAllureReportsTest
{
	MyGoogleChromeBrowser mgc = new MyGoogleChromeBrowser();
	WebDriver driver = mgc.DoUseGoogleChromeBrowser();
	//AllureTestListener atl = new AllureTestListener();
	//File f1 = new File("allure.html");
	//AllureReportGenerator alrg = new AllureReportGenerator(f1);
	
	/**
	 * @param args
	 */
	//public static void main(String[] args)
	@BeforeTest
	@Step(value="Initialize")
	public void Test000MyAllureTestMain()
	{
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}

	@Test
	@Step(value="Navigation")
	public void Test001NavigateToGoogleWebSite()
	{
		driver.navigate().to("http://google.com");
	}
	
	@AfterTest
	@Step(value="Close Browser")
	public void Test002CloseGoogleChromeWebBrowser()
	{
		driver.close();
		driver.quit();
		//alrg.generate(f1);
		
	}
	

	
}
