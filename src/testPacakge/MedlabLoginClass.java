package testPacakge;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MedlabLoginClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\seleniumMavenFramework\\src\\main\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.medlablive.in/");

		driver.findElement(By.id("user_name")).sendKeys("demo");
		driver.findElement(By.id("password")).sendKeys("demo1212");
		driver.findElement(By.id("b_login")).click();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Bill Entry")).click();

		// dropdown spanclass

		List<WebElement> options = driver.findElements(By.id("select2-Sex-container"));

		for (int i = 0; i < options.size(); i++) {
			WebElement element = options.get(i);
			String htmelem = element.getAttribute("innerHTML");
			System.out.println("inner html : " + htmelem);
		}

	}
}
