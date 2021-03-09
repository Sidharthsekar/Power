package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class RedBus {
	public static void main(String[] args) {
		System.out.print(2);
	}
	
	@Test
	public void createUser() {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver v85.exe");
		System.out.print(2);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://google.com");
	}
}
