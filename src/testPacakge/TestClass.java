package testPacakge;

import java.util.concurrent.TimeUnit;

import javax.xml.stream.XMLReporter;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://43.225.54.129/medlab/demo/");
		
		driver.findElement(By.id("user_name")).sendKeys("demo");
		
		WebElement elementUser=driver.findElement(By.id("user_name"));
		elementUser.sendKeys(Keys.TAB);
		driver.findElement(By.name("password")).sendKeys("demo1212");
		WebElement elementPass=driver.findElement(By.name("password"));
		elementPass.sendKeys(Keys.TAB);
		driver.findElement(By.name("Login")).click();
		WebElement elementClick=driver.findElement(By.name("Login"));
		elementClick.sendKeys(Keys.ENTER);

	}


}
