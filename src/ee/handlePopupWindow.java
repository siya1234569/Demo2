package ee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlePopupWindow {
public WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "e:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/");
		handlePopupWindow pw=new handlePopupWindow();
		pw.popUpSize();

	}
	///not run need to put effort
	public WebElement popUpSize()
	{
		driver.findElement(By.xpath("//button[contains(text(),'NO THANKS')]")).click();
		return null;
	}

}

	
