package ee;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class saucelabsTest {
	 public static final String USERNAME = "p12_r-.";
	  public static final String ACCESS_KEY = "d914eea9-42e9-4ef2-ac8b-4db130f43713";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		MutableCapabilities sauceOptions = new MutableCapabilities();
		DesiredCapabilities caps= DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 7");
		caps.setCapability("version", "51.0");

		/*ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setExperimentalOption("w3c", true);
		browserOptions.setCapability("platformName", "Windows 7");
		browserOptions.setCapability("browserVersion", "51.0");
		browserOptions.setCapability("sauce:options", sauceOptions);*/
		
		
		WebDriver driver = new RemoteWebDriver(new URL(URL),caps);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}

}
