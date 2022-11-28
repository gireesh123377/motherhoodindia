package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.google.utilitys.genericmethods;

import finddoctor.findadoctor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class base extends findadoctor {
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	@Test
		public void launchApp() throws IOException, InterruptedException 
			{
					  ChromeOptions p = new ChromeOptions();
					  p.addArguments("--disable-notifications");
					  WebDriverManager.chromedriver().setup();
					  driver=new ChromeDriver(p);

					  driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);

					  genericmethods gm= new genericmethods();
					  String url=gm.PropertyReader();

				      driver.get(url);
				      driver.manage().window().maximize();
				      Thread.sleep(4000);
				      findadoctor fd=new findadoctor();
				      fd.login(driver, gm);

			}


	@AfterTest	
		public void closeapp()
			{
				driver.quit();
			}

}
