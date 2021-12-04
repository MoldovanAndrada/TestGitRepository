package tema1;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.BaseTest;

public class Tema2 extends BaseTest{

	@Test
	public void Tema2() {
	List<WebElement>  selectedMenu = driver.findElements(By.cssSelector("li[class*='sc_tabs_title']"));
	WebElement theforest=null;

	for (WebElement el : selectedMenu) {	
		el.click();
		/*
		List<WebElement> bookTitles = driver.findElements(By.cssSelector("h3[class*='sc_title']"));
		for (WebElement bt : bookTitles) {
			if(bt.getText().contains("forest")) {
				System.out.println("Element found on page");
			}
		}
		*/
		
		theforest = driver.findElement(By.partialLinkText("forest"));	
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(theforest.isDisplayed());
	}
	
	theforest.click();
	assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-forest/");
	
	}
	
}
