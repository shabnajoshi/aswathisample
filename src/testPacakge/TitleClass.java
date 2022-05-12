package testPacakge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://en-gb.facebook.com/";
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		System.out.println("actual title= "+actualTitle);
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}

	}

}
