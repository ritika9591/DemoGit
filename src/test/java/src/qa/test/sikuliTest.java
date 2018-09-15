package src.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class sikuliTest {
	
	static WebDriver driver;
	static String baseUrl;
	public static void main(String [] args)throws FindFailed
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver= new ChromeDriver();
		baseUrl="https://www.youtube.com/watch?v=t5hoD4D0Jo0&list=PLFGoYjJG_fqrY1RKpMmoVxMzL57WNc8cf&index=2";
		//driver.manage().window().maximize();
		driver.get(baseUrl);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Screen scr=new Screen();
		System.out.println(ImagePath.getBundlePath());
		Pattern muteVideo = new Pattern("YT_Mute.png");
		
		scr.wait("muteVideo.5000");
		scr.click();
		scr.click();
		
	}

}
