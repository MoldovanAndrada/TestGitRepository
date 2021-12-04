package tema1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tema {

	WebDriver driver; 
	
	@BeforeClass 
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://keybooks.ro/");
	}
	
	@Test(priority = 1)
	public void linkTextLocatorExample() {
		WebElement login = driver.findElement(By.className("menu_user_login"));
		login.click();
		WebElement nume = driver.findElement(By.id("log"));
		WebElement parola = driver.findElement(By.id("password"));
		assertEquals(nume.isDisplayed(), true);
		assertEquals(parola.isDisplayed(), true);
	}
}
