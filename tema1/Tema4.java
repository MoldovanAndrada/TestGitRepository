package tema1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Tema4 extends BaseTest{
	
	@Test(priority=1)
	public void Tema() throws InterruptedException {
		WebElement search = driver.findElement(By.xpath("//button[@title='Open search' and @class='search_submit icon-search']"));
		search.sendKeys("The story about me", Keys.RETURN);
		
		WebElement storyBook = null;

		while (storyBook == null) {
			try {
				storyBook = driver.findElement(
						By.xpath("//div[@class='post_thumb' and @data-title='The story about me']"));
			} catch (NoSuchElementException e) {
				Thread.sleep(1000);
				storyBook.click();
			}
		}
		
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-story-about-me/");
		
		WebElement addToCart = driver.findElement(By.xpath("//button[@name='add-to-cart']"));
		addToCart.click();
		
		WebElement addedCart = driver.findElement(By.xpath("//div[@class='woocommerce-message']"));
		
		assertTrue(addedCart.isDisplayed());
		
		WebElement viewCart = driver.findElement(By.xpath("//a[contains(text() , 'View cart' )]"));
		viewCart.click();
	}
	
	@Test(priority=2)
	public void Temab() {
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/cart/");
		driver.findElement(By.xpath("//span[@class='q_inc']")).click();
		
		driver.findElement(By.xpath("//button[@name='update_cart']")).click();
		
		driver.findElement(By.xpath("//div[@class='woocommerce-message']")).click();
		
		driver.findElement(By.xpath("//a[contains(text() , 'Proceed to checkout' )]")).click();

		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/checkout/");

		assertTrue(driver.findElement(By.xpath("//div[class='woocommerce-additional-fields']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//div[class='woocommerce-billing-fields']")).isDisplayed());

	}

}
